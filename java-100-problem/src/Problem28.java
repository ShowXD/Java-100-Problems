import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args){

        int oao = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //階層 (!n)
        for (int i = 1 ; i <= n ; i++){
            oao = oao * i;
        }
        System.out.println(oao);
    }
}
