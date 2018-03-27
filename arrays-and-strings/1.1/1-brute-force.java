public class Main {

    // O(n^2)
    public boolean isUnique(String s) {
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) return false;
            }
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