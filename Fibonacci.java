import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> ls = new HashSet<>();
        int max=arr[0];
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        int num=0;
        ls.add(num);
        int num2=1;
        ls.add(num2);
        while(num2<max){
            int sum=num+num2;
            ls.add(sum);
            num=num2;
            num2=sum;
        }
        for(int i:arr){
            if(ls.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
