import java.util.*;
public class Pairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=1;i<size;i++){
            if(diff == arr[i]-arr[i-1]){
                ls.add(arr[i]);
                ls.add(arr[i-1]);
            }
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
}
