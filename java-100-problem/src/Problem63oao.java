import java.util.Scanner;

public class Problem63oao {
    public static void main(String[] args) {

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int month = scn.nextInt();

        if (year / 4 == 0 && year / 400 == 0) {
            if (month == 2) {
                int xu[] = new int[29];
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                int xu[] = new int[30];
            } else {
                int xu[] = new int[31];
            }
        }else {
            if (month == 2) {
                int xu[] = new int[28];
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                int xu[] = new int[30];
            } else {
                int xu[] = new int[31];
            }
        }

        System.out.println("SU" + "    " + "MO" + "    " + "TU" + "    " + "WE" + "    " +"TH" + "    " + "FR" +"    " + "SA");

    }
}
