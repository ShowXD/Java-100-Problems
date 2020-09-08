import java.util.Scanner;

public class Problem65 {
    public static void main(String[] args) {

        //等待玩家輸入
        int w = 0;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        String n = scn.next();

        //測量文字長度
        String stringValue = String.valueOf(n);
        int howlong = stringValue.length();

        for (int i = 0 ; i < howlong ; i++) {
            char x = stringValue.charAt(w);
            int j = (int) x ;
            w++;
            if (j >= 48 && j <= 57) {
                int k = Character.getNumericValue(x);
                count = count + k;
            }
        }
        System.out.println(count);
    }
}
