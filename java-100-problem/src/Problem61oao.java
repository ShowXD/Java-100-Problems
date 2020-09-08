import java.util.Scanner;

public class Problem61oao {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N1 = scn.nextInt();
        int N2 = scn.nextInt();
        int n1[] = new int[N1];
        int n2[] = new int[N2];
        for (int i = 0 ; i < N1 ; i++){
            n1[i] = scn.nextInt();
        }
        for (int i = 0 ; i < N2 ; i++){
            n2[i] = scn.nextInt();
        }
    }
}
