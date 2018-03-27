public class Main {
    
    // O(nlogn)
    public boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.length() == 0) return true;
        
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPermutation("", ""));
        System.out.println(main.isPermutation("a", "b"));
        System.out.println(main.isPermutation("abab", "baba"));
    }
}