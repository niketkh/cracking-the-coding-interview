public class Main {

    // O(n)
    public boolean isUnique(String s) {
        if(s.length() > 256) return false;
        
        boolean chars[] = new boolean[256];
        Arrays.fill(chars, false);
        
        for(int i=0; i<s.length(); i++) {
            if(chars[s.charAt(i)] == true) return false;
            chars[s.charAt(i)] = true;
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