import java.util.Scanner;

public class Problem71 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        int howlong = number.length();
        int moewasubete[] = new int[howlong];
        for (int i = 0 ; i < howlong ; i++){
            moewasubete[i] = Character.getNumericValue(number.charAt(i));
        }
        //第一行
        for (int i = 0 ; i < howlong ; i++){
            number1(moewasubete[i]);
            System.out.print(" ");
        }
        System.out.println();

        //第二行
        for (int i = 0; i < howlong; i++) {
            number2(moewasubete[i]);
            System.out.print(" ");
        }
        System.out.println();

        //第三行
        for (int i = 0 ; i < howlong ; i++){
            number3(moewasubete[i]);
            System.out.print(" ");
        }
        System.out.println();

        //第四行
        for (int i = 0 ; i < howlong ; i++){
            number4(moewasubete[i]);
            System.out.print(" ");
        }
        System.out.println();

        //第五行
        for (int i = 0 ; i < howlong ; i++){
            number5(moewasubete[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void number1(int x){
        if (x == 0){
            System.out.print("*****");
        }else if (x == 1){
            System.out.print("    *");
        }else if (x == 2){
            System.out.print("*****");
        }else if (x == 3){
            System.out.print("*****");
        }else if (x == 4){
            System.out.print("*   *");
        }else if (x == 5){
            System.out.print("*****");
        }else if (x == 6){
            System.out.print("*****");
        }else if (x == 7){
            System.out.print("*****");
        }else if (x == 8){
            System.out.print("*****");
        }else{
            System.out.print("*****");
        }
    }
    public static void number2(int x){
        if (x == 0){
            System.out.print("*   *");
        }else if (x == 1){
            System.out.print("    *");
        }else if (x == 2){
            System.out.print("    *");
        }else if (x == 3){
            System.out.print("    *");
        }else if (x == 4){
            System.out.print("*   *");
        }else if (x == 5){
            System.out.print("*    ");
        }else if (x == 6){
            System.out.print("*    ");
        }else if (x == 7){
            System.out.print("    *");
        }else if (x == 8){
            System.out.print("*   *");
        }else{
            System.out.print("*   *");
        }
    }
    public static void number3(int x){
        if (x == 0){
            System.out.print("*   *");
        }else if (x == 1){
            System.out.print("    *");
        }else if (x == 2){
            System.out.print("*****");
        }else if (x == 3){
            System.out.print("*****");
        }else if (x == 4){
            System.out.print("*****");
        }else if (x == 5){
            System.out.print("*****");
        }else if (x == 6){
            System.out.print("*****");
        }else if (x == 7){
            System.out.print("    *");
        }else if (x == 8){
            System.out.print("*****");
        }else{
            System.out.print("*****");
        }
    }
    public static void number4(int x){
        if (x == 0){
            System.out.print("*   *");
        }else if (x == 1){
            System.out.print("    *");
        }else if (x == 2){
            System.out.print("*    ");
        }else if (x == 3){
            System.out.print("    *");
        }else if (x == 4){
            System.out.print("    *");
        }else if (x == 5){
            System.out.print("    *");
        }else if (x == 6){
            System.out.print("*   *");
        }else if (x == 7){
            System.out.print("    *");
        }else if (x == 8){
            System.out.print("*   *");
        }else{
            System.out.print("    *");
        }
    }
    public static void number5(int x){
        if (x == 0){
            System.out.print("*****");
        }else if (x == 1){
            System.out.print("    *");
        }else if (x == 2){
            System.out.print("*****");
        }else if (x == 3){
            System.out.print("*****");
        }else if (x == 4){
            System.out.print("    *");
        }else if (x == 5){
            System.out.print("*****");
        }else if (x == 6){
            System.out.print("*****");
        }else if (x == 7){
            System.out.print("    *");
        }else if (x == 8){
            System.out.print("*****");
        }else{
            System.out.print("    *");
        }
    }
}
