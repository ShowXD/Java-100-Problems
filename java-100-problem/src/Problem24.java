import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args){

        //變數命名區
        int x = 0 ; int y = 0 ; int z = 0;

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int name[]=new int[6];
        for (int i = 0 ; i < 6 ; i++) {
            name[i] = scn.nextInt();
        }
        for (int i = 0;i < 6;i++) {
            if (name[i] > 0) {
                x++;
            }
            if (name[i]==0){
                y++;
            }
            if (name[i]<0){
                z++;
            }
        }
        System.out.println("+ = "+x);
        System.out.println("0 = "+y);
        System.out.println("- = "+z);
    }
}
