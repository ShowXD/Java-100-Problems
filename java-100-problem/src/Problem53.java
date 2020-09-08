import java.util.Scanner;

public class Problem53 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        while (true){
            int n = scn.nextInt();
            square(n);
        }
    }
    public static void square(int x){
        System.out.println(x * x + "\t");
    }
}
