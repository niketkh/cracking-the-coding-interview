public class Main {
    
    public String urlify(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') sb.append("%20");
            else sb.append(c);
        }
            
        return sb.toString();
        
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.urlify(""));
        System.out.println(main.urlify("Mr John Smith"));
    }
}