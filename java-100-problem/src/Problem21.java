import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args){

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        //判斷是什麼三角形
        double z = Math.pow(a,2);
        double x = Math.pow(b,2);
        double y = Math.pow(c,2);
        if (z + x == y){
            System.out.println("Right triangle");
                }else if (z + x < y){
            System.out.println("Obtuse triangle");
                }else if (z + x > y){
            System.out.println("Acute triangle");
        }
    }
}
