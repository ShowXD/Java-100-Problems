import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int h = scn.nextInt();

        //呼叫函數
        F(w , h);
    }

    //F函數
    public static void F(int w , int h){
        int k = 1;
        for (int i = 1 ; i <= h ; i++){
            for (int j = 0 ; j < w ; j++){
                System.out.print(k+"    ");
                k = k+i;
            }
            k = 1+i;
            System.out.println();
        }
    }
}
