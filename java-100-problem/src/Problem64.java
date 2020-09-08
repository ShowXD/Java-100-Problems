import java.util.Scanner;

public class Problem64 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int o = 0;
        int p = 0;
        int count = 1;
        int xu[][] = new int[n+1][n+1];

        //輸入第一種排列
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                xu[o][p] = count;
                if (o % 2 == 0) {
                    p++;
                } else {
                    p--;
                }
                count++;
            }
            if (o % 2 ==0){
                p--;
            }else{
                p++;
            }
            o++;
        }

        //顯示出第一種排列
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(xu[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        o = 0;
        p = 0;
        count = 1;

        //輸入第二種排列
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                xu[o][p] = count;
                if (p % 2 == 0){
                    o++;
                }else{
                    o--;
                }
                count++;
            }
            if (p % 2 == 0){
                o--;
            }else{
                o++;
            }
            p++;
        }

        //顯示出第二種排列
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(xu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
