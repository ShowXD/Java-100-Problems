import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args){

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int z = scn.nextInt();

        System.out.print(fun(z));
    }
    public static int fun(int z){
        if (z == 0){
            return 0;
        }else{
            return 1 + fun(z / 10);
        }
    }
}
