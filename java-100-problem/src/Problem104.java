import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem104 {
    public static void main(String args[]){
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner scn =  new Scanner(System.in);
        while (true){
            String detail = scn.nextLine();
            String meow[] = detail.split(" ");
            if (meow[1].equals("1")){
                System.out.println(df.format((Integer.parseInt(meow[0]) - 80)*0.7));
            }else {
                System.out.println(df.format((Integer.parseInt(meow[0]) - 70)*0.6));
            }
        }
    }
}
