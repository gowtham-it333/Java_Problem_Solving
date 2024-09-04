import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] m_arr=new int[m];
        int[] n_arr=new int[n];
        double result;
        for (int i = 0; i < m; i++) {
            m_arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            n_arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i: m_arr){
            ls.add(i);
        }
        for(int j: n_arr){
            ls.add(j);
        }
        Collections.sort(ls);
        if(ls.size()%2==1){
            result=ls.get(ls.size()/2);
        }
        else{
            result=ls.get(ls.size()/2)+ls.get(ls.size()/2 -1)/2.0;
        }
        System.out.printf("%.6f",result);
    }
}
