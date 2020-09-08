import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();

        //計算溫度並顯示
        System.out.println(b * 9 / 5 + 32);
    }
}