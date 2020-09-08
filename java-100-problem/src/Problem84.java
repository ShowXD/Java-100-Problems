package one_hundred_problems;

import java.util.Scanner;

public class Problem84 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        String sentence = "";
        for (int i = number.length() - 1 ; i >= 0 ; i--){
            char word = number.charAt(i);
            sentence += word;
        }
        if (number.equals(sentence)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
