public class Main {

    // O(n)
    public boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        
        return (s.length() == set.size());
    }
    
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isUnique(""));
        System.out.println(main.isUnique("a"));
        System.out.println(main.isUnique("aba"));
    }
}