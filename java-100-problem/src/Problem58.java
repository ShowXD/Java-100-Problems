import java.util.Scanner;

public class Problem58 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(a , n));
    }
    public static int power(int a , int n){
        if (n > 0){
            return a * power(a , n-1);
        }else{
            return 1;
        }
    }
}
