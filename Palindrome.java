import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> ls = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                ls.add(Character.toLowerCase(s.charAt(i)));
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                ls.add(s.charAt(i));
            }
        }
    }
}
