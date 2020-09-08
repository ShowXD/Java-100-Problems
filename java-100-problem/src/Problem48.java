import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0 ; i <= n ; i++){
                System.out.print(i + "\t" + (i * i) + "\t" + (i *i *i));
            System.out.println();
        }
    }
}
