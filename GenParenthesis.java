import java.util.*;
public class GenParenthesis {
        public static boolean isValid(String sb){
            Stack <Character> stk = new Stack<>();
            if(sb.length()==0) return false;
            int ind=0;
            while(ind<sb.length()){
                if(sb.charAt(ind)=='('){
                    stk.push(sb.charAt(ind));
                    ind++;
                }
                else{
                    if(stk.peek()=='('){
                        stk.pop();
                    }
                    else{
                        stk.push(sb.charAt(ind));
                    }
                    ind++;
                }
            }
            if(stk.isEmpty()){
                return true;
            }
            return false;
        }
        public static void genParenUtility(int n,StringBuilder sb,List<String>res){
            if(isValid(sb.toString()) && sb.toString().length()==n*2){
                res.add(sb.toString());
                return;
            }
            if(sb.length()<n){
                sb.append('(');
            }
            else{
                sb.append(')');
            }
            genParenUtility(n,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        public static void main(String[] args) {
            int n=3;
            List<String> res=new ArrayList<>();
            StringBuilder sb=new StringBuilder();
            genParenUtility(n,sb,res);
            System.out.println(res);
        }
    }
