import java.util.Scanner;

public class Problem89 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int timestart[] = new int[number];
        int timeback[] = new int[number];
        int count = 0;
        for (int i = 0 ; i < number ; i++){
            timestart[i] = scn.nextInt();
            timeback[i] = scn.nextInt();
        }
        for (int i = 0 ; i < number ; i++){
            for (int j = 0 ; j < number ; j++){
                if (timeback[i] <= timestart[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(number - count);
    }
}
