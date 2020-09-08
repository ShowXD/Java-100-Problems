import java.util.Scanner;

public class Problem51 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int xu[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            xu[i] = scn.nextInt();
        }
        int temp;

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (xu[j] > xu[j + 1]) {
                    temp = xu[j];
                    xu[j] = xu[j + 1];
                    xu[j + 1] = temp;
                }
            }
        }

        for (int i = 0 ; i < n ; i++){
            System.out.println(xu[i]);
        }
    }
}
