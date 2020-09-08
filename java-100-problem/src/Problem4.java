import java.util.Random;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        //引用功能
        Random randnum = new Random();
        Scanner scn = new Scanner(System.in);
        int xu [][] = new int [5][5];

        //等待玩家輸入
        int z = scn.nextInt();
        randnum.setSeed(z);

        for (int o = 0; o < 5; o++) {
            for (int i = 0; i < 4; i++) {
                xu[o][i] = randnum.nextInt(10);
            }
            xu[o][4] = randnum.nextInt(10);
        }

        for (int o = 0; o < 5; o++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(xu[o][i] + "   ");
            }
            System.out.println(xu[o][4]+"   ");
        }
        System.out.println();

        for (int o = 0; o < 5; o++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(xu[i][o]+"   ");
            }
            System.out.println(xu[4][o]+"   ");
        }
    }
}
