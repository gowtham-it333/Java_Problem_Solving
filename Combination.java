import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Combination {
    static float fact(float n){
        if(n==0) return 1;
        else return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float r = sc.nextInt();
        float n_fact = fact(n);
        float r_fact = fact(r)*fact(n-r);
        float outcome= n_fact / r_fact;
        float prob =  outcome / (float)Math.pow(2, n);
        System.out.printf("%.6f",prob);
    }
}