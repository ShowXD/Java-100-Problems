import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args){

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(gcd(m ,n));
    }

    //gcd函數
    private static int gcd(int m, int n) {
        if(n == 0) {
            return m;
        }
        else {
            return gcd(n, m % n);
        }
    }
}