import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Answer = 0;
        int count = 1;

        for (int i = 1 ; i < n ; i++){
            Answer += i;
            if (Answer >= n){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
