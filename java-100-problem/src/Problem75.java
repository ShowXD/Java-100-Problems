import java.util.Scanner;

public class Problem75 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if (number >= 0){
            String process = Integer.toBinaryString(number);
            if (process.length() < 8){
                for (int i = 0 ; i < 8 - process.length() ; i++){
                    System.out.print("0");
                }
            }
            System.out.println(process);
        }else {
            String process = Integer.toBinaryString(number);
            String Answer = process.substring(process.length() - 8);
            System.out.println(Answer);
        }
    }
}