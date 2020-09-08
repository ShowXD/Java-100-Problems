import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args){

        double Answer;
        Scanner scn = new Scanner(System.in);
        int min = scn.nextInt();

        if (min < 600){
            Answer = min * 0.5;
            System.out.println(Answer);
        }else if (min >= 600 && min <=1200){
            Answer = min * 0.5 * 0.9;
            System.out.println(Answer);
        }else if (min > 1200){
            Answer = min * 0.5 * 0.79;
            System.out.println(Answer);
        }
    }
}
