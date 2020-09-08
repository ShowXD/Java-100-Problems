import java.util.Scanner;

public class Problem62 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //設定變數
        int xu[][] = new int[n][n];
        int count = 1;
        int o = 0;
        int p = 0;

        //把規定的順序放進陣列
        while (count <= n * n){
            xu[o][p] = count;
            count++;
            if (o == 0 && p == 0){
                o += 1;
            }else if (o == 0 && p != n - 1){
                o = p + 1;
                p = 0;
            }else if (p == n-1){
                p = o + 1;
                o = n-1;
            }else{
                p++;
                o--;
            }
        }

        //顯示排好的陣列
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(xu[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
