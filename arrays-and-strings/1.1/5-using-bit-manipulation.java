public class Main {
    
    // Below solution valid only if string contains only a-z
    // Using Bit Manipulation on 32 bit integer
    // Set a bit corresponding to character if bit is already there is duplicate
    // O(n)
    public boolean isUnique(String s) {
        int checker = 0;
        
        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if((checker & 1<<index) != 0) return false;
            checker |= (1<<index);
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isUnique(""));
        System.out.println(main.isUnique("a"));
        System.out.println(main.isUnique("aba"));
    }
}