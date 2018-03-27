public class Main {
    
    public String compress(String s) {
        if(s.length() == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)) count++;
            else {
                sb.append(count);
                count = 1;
                sb.append(s.charAt(i));
            }
        }
        
        if(count > 1) sb.append(count);
        
        if(sb.length() < s.length()) return sb.toString();
        
        return s;
        
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.compress(""));
        System.out.println(main.compress("a"));
        System.out.println(main.compress("aaa"));
        System.out.println(main.compress("aaabbccccccccccccc"));
        System.out.println(main.compress("abc"));
    }
}