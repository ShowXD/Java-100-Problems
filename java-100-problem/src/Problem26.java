import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args){

        //設定變數
        int k;

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int number[]=new int[35];
        for (int i = 0 ; i < 35 ; i++) {
            number[i] = scn.nextInt();
        }

        //反轉陣列
        for (int j = 0 ; j < 5 ; j++) {
            k = j;
            for (int i = 0; i < 7; i++) {
                System.out.print(number[k] + "    ");
                k += 5;
            }
            System.out.println();
        }
    }
}
