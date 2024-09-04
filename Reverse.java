import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("[.]",0);
        ArrayList<String> ls = new ArrayList<>();
        for(String s:strArr){
            ls.add(s);
        }
        Collections.reverse(ls);
        System.out.println(String.join(".",ls));
    }
}



