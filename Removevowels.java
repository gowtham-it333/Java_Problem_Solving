import java.util.*;

public class Removevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        int i=0;
        char last = 'a';
        while(!st.empty()){
            char ch = st.pop();
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(( i!=0 && last == ch) || st.peek() == 'a' || st.peek() == 'e' || st.peek() == 'i' || st.peek() == 'o' || st.peek() == 'u') {
                    sb.append(ch);
                }
            }
            else{
                sb.append(ch);
            }
            last=ch;
            i++;
        }
        System.out.println(sb.reverse());
    }
}
