import java.util.Random;
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args){

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
        while (k < 3) {
            xu[k] = randomnum.nextInt(100);
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

        //最小值
        int min = xu[0]; //先將陣列的第一個值視為最大值
        for(int x = 0 ; x < 3 ; x++){
            if(xu[x] < min) {
                min = xu[x];
            }
        }

        //最大值
        int max = xu[0];
        for (int i = 0 ; i < 3 ; i++){
            if (xu[i] > max){
                max = xu[i];
            }
        }

        //顯示答案
        System.out.println(max + " " + min);
    }
}
