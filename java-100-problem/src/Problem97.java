import java.util.Scanner;

public class Problem97 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String answer = scn.next();
        while (true){
            int A = 0;
            int B = 0;
            String number = scn.next();

            //判斷幾A
            for (int i = 0 ; i < 4 ; i++){
                char answer_word = answer.charAt(i);
                char word = number.charAt(i);
                if (answer_word == word){
                    A++;
                }
            }

            //判斷幾B
            for (int i = 0 ; i < 4 ; i++){
                char answer_word = answer.charAt(i);
                for (int j = 0 ; j < 4 ; j++){
                    char word = number.charAt(j);
                    if (answer_word == word){
                        B++;
                    }
                }
            }
            B = B - A;
            if (number.equals("0000")){
                break;
            }
            System.out.println(A + "A" + B + "B");
        }
    }
}
