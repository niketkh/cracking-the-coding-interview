public class Main {
    
    public String compress(String s) {
        if(s.length() == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for(int i=0; i<s.length(); ){
            char c = s.charAt(i);
            count = 0;
            while(i < s.length() && c == s.charAt(i)) {
                count++;
                i++;
            }
            sb.append(c);
            sb.append(count);
        }
        
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