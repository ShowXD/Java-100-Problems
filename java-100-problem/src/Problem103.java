import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem103 {
    public static void main(String args[]){
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner scn = new Scanner(System.in);
        while (true) {
            int count = 1;
            String sentence = scn.nextLine();
            //計算有幾個
            for (int i = 0 ; i < sentence.length() ; i++){
                char word = sentence.charAt(i);
                if (word == ' '){
                    count++;
                }
            }
            String meow[] = sentence.split(" ");
            double totall = 0;
            for (int i = 0 ; i < count ; i++){
                totall += Double.parseDouble(meow[i]);
            }
            System.out.println("Size:" + count);
            System.out.println("Average:" + df.format(totall/count));
        }
    }
}
