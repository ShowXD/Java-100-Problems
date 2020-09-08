import java.util.Scanner;

public class Problem94 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        Float r = scn.nextFloat();
        int n = scn.nextInt();
        int p = scn.nextInt();
        double Answer = 0;
        for (int i = 0 ; i < n ; i++){
            Answer += p;
            Answer = Answer * r + Answer;
        }
        System.out.println(Math.round(Answer));
    }
}
