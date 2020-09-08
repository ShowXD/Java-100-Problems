import java.util.Random;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        //設定變數
        int k = 0;
        int xu [] = new int [6];
        boolean flag = true;
        Random randomnum = new Random();

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int z = scn.nextInt();
        randomnum.setSeed(z);

        //產生不重複的亂數
        while (k < 6) {
            xu[k] = randomnum.nextInt(42)+1;
            if (k > 0) {
                for (int i = 0; i < k; i++) {
                    flag = true;
                    if (xu[k] == xu[i]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                k++;
            }
        }
        for (int i = 0 ; i < 6 ; i++){
            System.out.print(xu[i]+"    ");
        }
    }
}