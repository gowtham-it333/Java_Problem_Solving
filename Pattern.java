import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb =new StringBuilder();
        sb.append(1);
        if(n>=1){
            System.out.println(1);
        }
        for(int i=2;i<=n;i++){
            String str = sb.toString();
            sb.setLength(0);
            int count=1;
            for(int j=0;j<str.length()-1;j++){
                if(str.charAt(j)==str.charAt(j+1)){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(str.charAt(j));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(str.charAt(str.length()-1));
            System.out.println(sb);
        }
    }
}
