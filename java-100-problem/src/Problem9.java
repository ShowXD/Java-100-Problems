import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        //顯示答案
        System.out.println(a + b + c + "\n" + (a + b +c) / 3);
    }
}
