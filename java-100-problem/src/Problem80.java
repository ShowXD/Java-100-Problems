import java.util.Scanner;

public class Problem80 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        if (num1 > num2){
            System.out.println(GCD(num1 , num2));
        }else {
            System.out.println(GCD(num2 , num1));
        }
    }
    public static int GCD(int num1 , int num2){
       if (num2 == 0){
           return num1;
       }else {
           return GCD(num2,num1 % num2);
       }
    }
}