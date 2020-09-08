import java.util.Scanner;

public class Problem74 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int starthr = scn.nextInt();
        int startmin = scn.nextInt();
        int finhr = scn.nextInt();
        int finmin = scn.nextInt();

        if (startmin > finmin){
            finhr = finhr -1;
            finmin = finmin + 60;
            int Anshr = finhr - starthr;
            int Ansmin = finmin - startmin;

            if (Anshr < 2){
                int money = 30 * (Anshr / 2);
                if (Ansmin > 30){
                    money = money + 30;
                }
                System.out.println(money);
            }else if (Anshr < 4){
                int money = 120 + (40 * (Anshr / 2));
                if (Ansmin > 30){
                    money = money + 40;
                }
                System.out.println(money);
            }else {
                int money = 280;
                if (Ansmin > 30){
                    money = money + 60;
                }
                System.out.println(money);
            }
        }else {
            int Anshr = finhr - starthr;
            int Ansmin = finmin - startmin;

            if (Anshr < 2){
                int money = 30 * (Anshr / 2);
                if (Ansmin > 30){
                    money = money + 30;
                }
                System.out.println(money);
            }else if (Anshr < 4){
                int money = 120 + (40 * (Anshr / 2));
                if (Ansmin > 30){
                    money = money + 40;
                }
                System.out.println(money);
            }else {
                int money = 280;
                if (Ansmin > 30){
                    money = money + 60;
                }
                System.out.println(money);
            }
        }
    }
}