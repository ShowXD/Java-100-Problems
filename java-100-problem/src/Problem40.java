import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {

        //設定變數
        String oao = "";

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
//        System.out.print("請輸入=");
        String z = scn.next();

        //測量文字長度
        String stringValue = String.valueOf(z);
        int howlong = stringValue.length();
        int w = howlong - 1;

        //抓起來再度拼湊
        for (int i = 0 ; i < howlong ; i++){
            char x = stringValue.charAt(w);
            w -=1;
            oao += x;
        }
        System.out.print(oao);
    }
}
