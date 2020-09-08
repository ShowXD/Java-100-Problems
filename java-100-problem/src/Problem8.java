import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        //顯示和，差，乘積
        System.out.println(a + b + "\n" + (a - b) + "\n" + a * b );
    }
}
