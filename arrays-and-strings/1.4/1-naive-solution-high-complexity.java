public class Main {
    
    List<StringBuffer> permutations = new ArrayList<>();
    
    public boolean isPermutationPalindrome(String s) {
        if(s.length() == 0) return true;
        
        permutations.clear();
        s = s.replaceAll("[^a-zA-Z]+", "");
        StringBuffer sb = new StringBuffer(s);
        permute(sb, 0, s.length() - 1);
        for(StringBuffer permutation: permutations) {
            // System.out.println(permutation);
            if(isPalindrome(permutation.toString())) return true;
        }
        
        return false;
    }
    
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j) {
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        
        return true;
    }
    
     private void permute(StringBuffer sb, int l, int r) {
        if (l == r) {
            // System.out.println(sb);
            // As StringBuffer is Object and passed by reference
            permutations.add(new StringBuffer(sb));
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                swap(sb, l, i);
                permute(sb, l+1, r);
                swap(sb, l, i);
            }
        }
    }

    private  static void swap(StringBuffer sb, int i, int j){
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
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