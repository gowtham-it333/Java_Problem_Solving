import java.util.*;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='(' || str.charAt(i)==')'){
                if(!st.empty() && str.charAt(i) == ')'){
                    if(st.peek()=='(')
                        st.pop();
                    else
                        st.push(str.charAt(i));
                }
                else{
                    st.push(str.charAt(i));
                }
            }
            i++;
        }
        if(st.empty()){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
