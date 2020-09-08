import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args){

        double count = 1.0;
        double counts = 2.0;
        double Answer = 0.0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0 ; i < n ; i++){
            Answer += 1d/(count*counts);
            count += 2;
            counts += 2;
        }
        System.out.println(Answer);
    }
}
