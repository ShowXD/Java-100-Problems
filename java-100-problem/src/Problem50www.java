import java.util.Scanner;

public class Problem50www {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 1;
        int k = n;

       while (k <= 10000){
           count++;
           k = k*n;
       }
       System.out.println(count);
    }
}
