import java.util.Scanner;

public class Problem79 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int count = 0;
        for (int i = 1 ; i <= number ; i++){
            if (i % 3 == 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}
