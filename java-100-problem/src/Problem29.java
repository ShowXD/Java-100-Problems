import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args){

        int oao = 1;
        int i = 1;
        int count = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //階層 (!n)
        while (count < n){
            count++;
            i++;
            oao = oao * i;
        }
        System.out.println(oao);
    }
}