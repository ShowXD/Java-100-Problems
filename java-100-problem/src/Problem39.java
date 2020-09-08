import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {

        int number;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1 ; i <= n ; i++){
            number = i;
            for (int j = 0 ; j < n ; j++){
                System.out.print(number + "\t");
                number +=i;
            }
            System.out.println();
        }
    }
}