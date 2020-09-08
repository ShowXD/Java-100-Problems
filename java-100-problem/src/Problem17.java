import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args){

        int w = 0;
        Scanner scn = new Scanner(System.in);
        int z = scn.nextInt();

        //測量文字長度
        String stringValue = String.valueOf(z);
        int howlong = stringValue.length();

        //分別顯示數字
        for (int i = 1; i<=howlong ; i++) {
            char x = stringValue.charAt(w);
            w = w + 1;
            System.out.print(x+"    ");
        }
    }
}
