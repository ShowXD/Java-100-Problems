package one_hundred_problems;

import java.util.Scanner;

public class Problem78 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean flag = false;
        for (int i = 2 ; i < number ; i++){
            if (number % i == 0){
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        if (flag){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
