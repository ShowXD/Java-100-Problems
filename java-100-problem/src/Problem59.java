import java.util.Scanner;

public class Problem59 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int n [] = new int[N];

        for (int i = 0 ; i < N ; i++){
            n[i] = scn.nextInt();
        }

        for (int i = 0 ; i < N ; i++){
            for (int j = 0; j < N - 1 ;j++){
                if (n[j] < n[j+1]) {
                    int tmp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = tmp;
                }
            }
        }
        System.out.println(n[0] * n[1]);
    }
}
