import java.util.Scanner;

public class Problem85oao {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        int space = 1;
        for (int i = 0 ; i < sentence.length() ; i++){
            char word = sentence.charAt(i);
            if (word == ' '){
                space++;
            }
        }
        System.out.println(space);
    }
}
