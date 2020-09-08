import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args){

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        //判斷是否為合法三角形
        if (a<=b && b<=c && c>=a){
            if (a+b>c && b+c>a && a+c>b){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else{
            System.out.println("False");
        }
    }
}
