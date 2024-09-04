import java.util.*;
import java.lang.*;
public class BinToDec {
    public static void main(String[] args) {
        String str="10001000";
        int dec=0;
        int power = str.length()-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                dec+= (int)Math.pow(2,power);
                power--;
            }
            else
                power--;
        }
        System.out.println(dec);;
    }
}
