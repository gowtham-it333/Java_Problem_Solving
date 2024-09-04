import java.util.*;

public class BintoHex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String words[] = str.split("[.]");


        StringBuilder sb = new StringBuilder(words[0]);
        int zeros = 4 - sb.length() % 4;

        if(zeros != 0){
            for(int i = 0;i < zeros;i++){
                sb.insert(0,'0');
            }
        }
        StringBuilder ans = new StringBuilder();
        int iteration = sb.length() / 4;
        char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for(int i = 0;i < iteration;i++){

            StringBuilder sb2 = new StringBuilder(sb.substring(i*4,(i*4)+4));
            int two = 0;
            int sum = 0;

            for(int j = sb2.length() - 1;j >= 0;j--){
                int val = sb2.charAt(j) - '0';
                sum += val * Math.pow(2,two++);
            }
            ans.append(arr[sum]);
        }



        if(words.length == 2){
            ans.append(".");
            StringBuilder sb3 = new StringBuilder(words[1]);
            int nozeros = 4 - sb3.length() % 4;

            if(nozeros != 0){
                for(int i = 0;i < zeros;i++){
                    sb3.append('0');
                }
            }

            int iteration1 = sb3.length() / 4;

            for(int i = 0;i < iteration1;i++){

                StringBuilder sb2 = new StringBuilder(sb3.substring(i*4,(i*4)+4));

                int two = 0;
                int sum = 0;

                for(int j = sb2.length() - 1;j >= 0;j--){
                    int val = sb2.charAt(j) - '0';
                    sum += val * Math.pow(2,two++);
                }

                ans.append(arr[sum]);
            }
        }

        System.out.println(ans);
    }
}
//Code for Binary to Hexadecimal without decimal
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String binary = sc.nextLine();
//        String[] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
//        ArrayList<Long> lls = new ArrayList<>();
//        ArrayList<Integer> ls = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        String[] spl = binary.split("[.]",0);
//        for(String s : spl){
//            lls.add(Long.parseLong(s));
//        }
//        for(Long bin : lls) {
//            while (bin > 0) {
//                long digit = bin % 10000;
//                ls.add((int)digit);
//                bin /= 10000;
//            }
//        }
//        for(int num: ls ) {
//            int index=0;
//            int i=0;
//            while (num >0){
//                int digit = num%10;
//                int sum = digit * (int)Math.pow(2,i);
//                index+=sum;
//                num/=10;
//                i++;
//            }
//            sb.append(str[index]);
//        }
//        sb.reverse();
//        System.out.println(sb);
//    }
//}