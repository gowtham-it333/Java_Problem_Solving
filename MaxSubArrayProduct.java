public class MaxSubArrayProduct {
    public static void main(String[] args) {
        int[] A = {2,3,-2,4};
        int max=A[0];
        int mul=1;
        for(int num:A){
            mul*=num;
            if(max<mul)
                max=mul;
            if(mul<=0)
                mul=1;
        }
        System.out.println(max);// mul;
    }
}
