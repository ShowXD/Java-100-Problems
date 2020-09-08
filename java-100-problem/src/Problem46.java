import java.util.Random;
import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {

            int num[] = new int[4];
            int numer[] = new int[4];
            int count = 0;
            Scanner scn = new Scanner(System.in);
            int seed = scn.nextInt();
            int number = scn.nextInt();

            Random randnum = new Random();
            randnum.setSeed(seed);
            String stringvalue = String.valueOf(randnum.nextInt(10000));
            String numberer = String.valueOf(number);

            for (int i = 0 ; i < 4 ; i++){
                char x = stringvalue.charAt(i);
                num[i] = x;
            }
            for (int i = 0 ; i < 4 ; i++){
                char x = numberer.charAt(i);
                numer[i] = x;
            }
            for (int i = 0 ; i < 4 ; i++){
                if (num[i] == numer[i]){
                    count++;
                }
            }
            System.out.print(count);
    }
}
