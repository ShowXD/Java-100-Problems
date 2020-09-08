import java.util.Scanner;

public class Problem92 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int position[][] = new int[3][3];
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                position[i][j] = scn.nextInt();
            }
        }
        boolean flag = false;
        for (int i = 0 ; i < 3 ; i++){
            if (position[0][i] == position[1][i] && position[0][i] == position[2][i]){
                flag = true;
                break;
            }else if (position[i][0] == position[i][1] && position[i][0] == position[i][2]){
                flag = true;
                break;
            }else if (position[0][0] == position[1][1] && position[0][0] == position[2][2]){
                flag = true;
                break;
            }else if (position[0][2] == position[1][1] && position[0][2] == position[2][0]){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
