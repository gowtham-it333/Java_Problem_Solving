import java.util.*;

public class SeparateEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr= new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i:arr){
            if(i%2==1){
                odd.add(i);
            }
            else{
                even.add(i);
            }
        }
        for(int i:arr2){
            if(i%2==0) {
                even.add(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
