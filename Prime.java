import java.util.*;

public class Prime {
    static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i: arr) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
