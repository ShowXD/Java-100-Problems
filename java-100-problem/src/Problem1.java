import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int z = scn.nextInt();
        int sum = 0;

        while (z > 0){
            sum = sum + z % 10;
            z = z / 10;
        }

        //顯示總和
        System.out.print(sum);
    }
}