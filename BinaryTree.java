import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        int[] arr = new int[3];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max,i);
        }
        int sum=0;
        for(int i:arr){
            if(i!=max)
                sum+=i;
        }
        if(sum==max) System.out.println(true);
        else System.out.println(false);

    }
}
