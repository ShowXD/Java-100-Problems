import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem91{
    public static void main(String args[]){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scn = new Scanner(System.in);
        Float number[] = new Float[10];
        for (int i = 0 ; i < 10 ; i++){
            number[i] = scn.nextFloat();
        }
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j < 10 ; j++){
                if (number[i] > number[j]){
                    Float math = number[i];
                    number[i] = number[j];
                    number[j] = math;
                }
            }
        }
        System.out.println("max=" + df.format(number[0]) + '\n' + "min=" + df.format(number[9]));
    }
}