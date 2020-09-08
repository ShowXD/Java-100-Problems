import java.util.Scanner;

public class Problem86 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String standard = scn.next();
        String sentence = scn.next();
        int howmany = 0;
        for (int i = 0 ; i < sentence.length() - standard.length() ; i++){
            String words = sentence.substring(i , i + standard.length());
            if (words.equals(standard)){
                howmany++;
            }
        }
        System.out.println(howmany);
    }
}
