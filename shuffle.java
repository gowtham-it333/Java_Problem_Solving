import java.util.*;

public class shuffle {
    static String remove(String word, char index){
        StringBuffer sb = new StringBuffer();
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != index){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String[] result = new String[words.length];
        for(String word : words){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i) >='0' && word.charAt(i) <='9'){
                    char ch = word.charAt(i);
                    int index = word.charAt(i)- '0';
                    result[index] = remove(word,ch);
                }
            }
        }
        for(String word : result){
            System.out.print(word + " ");
        }

    }
}
