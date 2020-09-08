import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();

        //顯示出英吋跟磅
        System.out.println(cm / 2.54 + "\n" + kg / 0.454);
    }
}
