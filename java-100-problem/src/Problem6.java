import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);

        //轉換大小寫
        int i = (int) x ;
        if (i >= 65 && i <= 90){
            System.out.println(Character.toLowerCase(x));
        }else if (i >= 97 && i <= 122){
            System.out.println(Character.toUpperCase(x));
        }
    }
}