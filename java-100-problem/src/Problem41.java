import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //測量文字長度
        String stringValue = String.valueOf(n);
        int howlong = stringValue.length();
        System.out.println(howlong);
    }
}
