import java.util.Scanner;

public class Problem102 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        int howmuch = scn.nextInt();
        for (int i = 0 ; i < sentence.length() ; i++) {
            char word = sentence.charAt(i);
            if (word != ' ' && word != '?') {
                int number = word + howmuch;
                System.out.print((char) number);
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
