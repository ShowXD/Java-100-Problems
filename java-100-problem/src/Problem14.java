import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        cm(x , y , z);
    }

    //cm函數
    public static void cm(int a , int b , int c ){
        int max = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                max = i;
            }
        }
        System.out.println(a * b * c/ max);
        }
}