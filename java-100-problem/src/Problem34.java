import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args){

        int i ;
        int j ;
        int k ;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for ( i = 3 ; i < n ; i++){
            for ( j = 3 ; j < n ; j++){
                for ( k = 3 ; k < n ; k++){
                    if ( i * i + j * j == k *k && i < j && i < k && j < k && i + k + j <= 30){
                        System.out.println(i + "    " + j + "   " + k);
                    }
                }
            }
        }
    }
}
