import java.util.Scanner;

public class Problem82 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        System.out.println(f(k));
    }
    public static int f(int n){
        if (n == 1){
            return n+=1;
        }else {
            return f(n-1) + f(n/2);
        }
    }
}
