import java.util.Scanner;

public class Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int last=-1;
        while (last<=size-1){
            last+=arr[last+1];
            count++;
        }
        System.out.println(count);
    }
}
