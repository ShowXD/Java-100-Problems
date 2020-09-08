import java.util.Random;
import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args){

        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int seed = scn.nextInt();
        rnd.setSeed(seed);
        int Answer = rnd.nextInt(100);
        while (true){
            int x = scn.nextInt();
            if (x > Answer){
                System.out.println("big");
            }else if (x < Answer){
                System.out.println("small");
            }else if (x == Answer){
                System.out.println("true");
            }
        }
    }
}
