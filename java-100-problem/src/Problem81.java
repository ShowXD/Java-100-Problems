import java.util.Scanner;

public class Problem81 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int vertical = scn.nextInt();
        int horizontal = scn.nextInt();
        int number[][]= new int[vertical][horizontal];
        int newnumber[][] = new int[horizontal][vertical];

        for (int i = 0 ; i < vertical ; i++){
            for (int j = 0 ; j < horizontal ; j++){
                number[i][j] = scn.nextInt();
            }
        }
        for (int i = 0 ; i < horizontal ; i++){
            for (int j = 0 ; j < vertical ; j++){
                System.out.print(number[j][i]);
                if (j != vertical - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
