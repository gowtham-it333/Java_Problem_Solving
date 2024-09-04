import java.util.*;

public class AlternateSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> ls = new ArrayList<>();
        int i=0,j=size-1;
        while (i!=j){
            ls.add(arr[j]);
            ls.add(arr[i]);
            i++;
            j--;
        }
        System.out.println(ls);
    }
}
