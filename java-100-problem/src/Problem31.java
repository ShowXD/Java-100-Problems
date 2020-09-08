import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args){

        int count = 1;
        int Answer = 0 ;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0 ; i < n ; i++){
            Answer = Answer + count*(count+1);
            count++;
        }
        System.out.println(Answer);
    }
}
