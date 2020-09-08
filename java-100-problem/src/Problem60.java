import java.util.Scanner;

public class Problem60 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int n[] = new int[N];
        int oao = 0;
        int count = 0;

        //輸入N個數值
        for (int i = 0; i < N; i++) {
            n[i] = scn.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                count++;
                oao += n[j];
                if (oao == 0) {
                    for (int k = count; k >= i ; k--) {
                        System.out.print(n[k] + " ");
                    }
                }
            }
            oao = 0;
            count = 0;
        }
    }
}
