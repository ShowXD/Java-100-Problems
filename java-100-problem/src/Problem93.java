import java.util.Scanner;

public class Problem93 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int totall = scn.nextInt();
        int apple = scn.nextInt();
        int orange = scn.nextInt();
        int pinch = scn.nextInt();
        int cost = apple * 15 + orange * 20 + pinch * 30;
        int last = totall - cost;
        if (totall < cost){
            System.out.println("0");
        }else {
            int one = 0;
            int five = 0;
            int fifty = 0;
            if (last >= 50) {
                fifty = last / 50;
                int left = last % 50;
                if (left >= 5){
                    five = left / 5;
                    one = left % 5;
                }
            }else if (last >= 5){
                five = last / 5;
                one = last % 5;
            }else {
                one = last;
            }
            System.out.print(one + " " + five + " " + fifty);
        }
    }
}
