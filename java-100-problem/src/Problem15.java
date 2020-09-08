import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args){

        //變數命名
        int sum = 1;
        int oao = 1;
        int owo = 1;

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        //階層 (!m)
        for (int i = 1 ; i <= m ; i++){
            sum = sum * i;
        }

        //階層 (!n)
        for (int i = 1 ; i <= n ; i++){
            oao = oao * i;
        }

        //階層 !(m-n)
        int k = m-n ;
        for (int i = 1 ; i <= k ; i++){
            owo = owo * i;
        }

        //C(m,n)
        System.out.print(sum / ( oao * owo ) );
    }
}
