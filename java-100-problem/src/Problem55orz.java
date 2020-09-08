import java.util.Scanner;

public class Problem55orz {
    public static void main(String[] args){

        //命名物件Scanner
        Scanner scn = new Scanner(System.in);
        int name[] = new int[5];

        for (int i = 0 ; i < 5 ; i++) {
            name[i] = scn.nextInt();
        }
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 4 ; j++) {
                if (name[j] > name[j + 1]) {
                    int tmp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tmp;
                }
            }
        }
        for (int i = 0 ; i < 5 ; i++){
            System.out.print(name[i] + " ");
        }
    }
}
