import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args){

        double Answer = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1 ; i <= n ; i++){
            Answer = Answer + Math.pow(2,i);
        }
        System.out.println((int)Answer);
    }
}
