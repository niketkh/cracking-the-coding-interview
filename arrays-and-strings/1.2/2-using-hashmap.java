public class Main {
    
    // O(n)
    public boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.length() == 0) return true;
        
        Map<Character, Integer> map = new HashMap<>();
        int len = s1.length();
        
        for(int i=0; i<len; i++) {
            char c = s1.charAt(i);
            if(map.get(c) != null)
                map.put(c, map.get(c) + 1);
            else 
                map.put(c, 1);
        }
        
        for(int i=0; i<len; i++) {
            char c = s2.charAt(i);
            if(map.get(c) == null || map.get(c) == 0)
                return false;
            map.put(c, map.get(c) - 1);
        }
        
        return true;
        
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPermutation("", ""));
        System.out.println(main.isPermutation("a", "b"));
        System.out.println(main.isPermutation("aaa", "b"));
        System.out.println(main.isPermutation("abab", "babb"));
        System.out.println(main.isPermutation("abab", "baba"));
    }
}