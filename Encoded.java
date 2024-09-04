import java.util.*;

public class Encoded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else{
                sb.append(str.charAt(i));
                sb.append(count);
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        System.out.println(sb);
    }
}
