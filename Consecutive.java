import java.util.*;

public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        int mid = n/3;
        if((mid-1)+mid+(mid+1) == n){
            ls.add(mid-1);
            ls.add(mid);
            ls.add(mid+1);
        }
        System.out.println(ls);
    }
}
