import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String c = scn.next();

        //呼叫函數
        square(n, c);
    }

    //square函數
    public static void square(int n , String c){
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
