public class Main {
    
    // Assuming input is char array with sufficient space at the end to hold additional characters
    // Also input for true length
    public String urlify(char arr[], int len) {
        // Keep two pointers - one for actual string traversal other for new string
        int i = len - 1, j = arr.length - 1;
        for(; i>=0; i--) {
            if(arr[i] == ' ') {
                arr[j--] = '0';
                arr[j--] = '2';
                arr[j--] = '%';
            }
            else {
                arr[j--] = arr[i];
            }
            
        }
        
        return new String(arr);
        
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.urlify("".toCharArray(), 0));
        System.out.println(main.urlify("abc".toCharArray(), 3));
        System.out.println(main.urlify("Mr John Smith    ".toCharArray(), 13));
    }
}