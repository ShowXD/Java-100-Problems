import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        caculate(number);
    }
    public static void caculate (int number){
        int check;
        String answer;
        boolean flag = true;
        for (int i = 1 ; i <= number ; i++){
            check = i;
            answer = Integer.toString(i);
            for (int j = i + 1 ; j <= number ; j++){
                check += j;
                answer = answer + "+" + j;
                if (check == number){
                    System.out.println(answer);
                    flag = false;
                }
            }
        }
        if (flag){
            System.out.println("NO");
        }
    }
}
