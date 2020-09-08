import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        //判斷奇偶數
        if (a % 2 == 0){
            System.out.println("Even");
        }else if (a % 2 == 1){
            System.out.println("Odd");
        }
    }
}