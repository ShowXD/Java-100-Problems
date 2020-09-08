import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {

        int count = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1 ; i <= n ; i++){
            System.out.print(count + "  ");
            if (count > n){
                break;
            }
            count = count + i;
        }
        System.out.println();
        for (int i = 0 ; i < n+2 ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print(i + "  ");
            }
//            if (i > n){
//                break;
//            }
        }
    }
}
