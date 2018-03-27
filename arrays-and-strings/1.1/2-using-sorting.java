public class Main {

    // O(nlogn)
    public boolean isUnique(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        for(int i=1; i<s.length(); i++) {
           if(arr[i-1] == arr[i]) return false;
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