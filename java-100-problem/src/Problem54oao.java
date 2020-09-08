import java.util.Scanner;

public class Problem54oao {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String xu[] = new String[n];
        for (int i = 0 ; i < n ; i++){
            xu[i] = scn.next();
        }
        for (int i = 0 ; i < n * (n - 1) ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(xu[j] + " ");
            }
            System.out.println();
        }
    }
}
