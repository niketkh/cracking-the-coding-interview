public class Main {
    
    // Time Complexity: O(n) 
    // Space Complexity: O(n)
    // A string can form a palindrome if at most one character occurs odd number of times 
    // and all other characters occur even number of times
    public boolean isPermutationPalindrome(String s) {
        if(s.length() == 0) return true;
        
        Map<Character, Integer> map = new HashMap<>();
        int oddFreqCharsCount = 0;
        s = s.replaceAll("[^a-zA-Z]+", "");
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == null)
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }
        
        for(int freq: map.values()) {
            if(freq % 2 != 0)
                oddFreqCharsCount++;
            if(oddFreqCharsCount > 1) return false;
        }
        
        
        return true;
    }
    
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPermutationPalindrome(""));
        System.out.println(main.isPermutationPalindrome("a"));
        System.out.println(main.isPermutationPalindrome("faf"));
        System.out.println(main.isPermutationPalindrome("fafa"));
        System.out.println(main.isPermutationPalindrome("bcded"));
        System.out.println(main.isPermutationPalindrome("aff"));
        System.out.println(main.isPermutationPalindrome("f af"));
        System.out.println(main.isPermutationPalindrome("fa a&*&*f"));
    }
}