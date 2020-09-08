import java.util.Scanner;

public class Problem68 {
    public static void main(String args[]){

        int count = 0;
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String nux = Integer.toBinaryString(number);
        for (int i = 0 ; i < nux.length() ; i++){
            char x = nux.charAt(i);
            if (x == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
