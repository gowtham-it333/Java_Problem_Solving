import java.util.*;
import java.lang.*;

class Frequency
{
    public static void freqSort(int[] arr,int size){
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while(T!=0){
            int size=sc.nextInt();
            int[] arr = new int[size];
            for(int itr=0;itr<size;itr++){
                arr[itr]=sc.nextInt();
            }
            Arrays.sort(arr);
            freqSort(arr,size);
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
            T--;
        }
    }
}