import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {

        int ID[] = new int[5];
        String name[] = new String[5];
        int score[] = new int[5];
        int scores[] = new int[5];
        int scoress[] = new int[5];
        int Total[] = new int[5];
        double Average[] = new double[5];
        int Totalsubject[] = new int[5];
        int Averagesubject[] = new int [5];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ID[i] = scn.nextInt();
            name[i] = scn.next();
            score[i] = scn.nextInt();
            scores[i] = scn.nextInt();
            scoress[i] = scn.nextInt();
        }

        //計算總和
        for (int i = 0; i < 5; i++) {
            Total[i] = score[i] + scores[i] + scoress[i];
        }
        Totalsubject[0] = score[0] + score[1] + score[2] + score[3] + score[4];
        Totalsubject[1] = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        Totalsubject[2] = scoress[0] + scoress[1] + scoress[2] + scoress[3] + scoress[4];

        //計算平均
        for (int i = 0; i < 5; i++) {
            Average[i] = Total[i] / 3d;
            Averagesubject[i] = Totalsubject[i]/5;
        }


            System.out.println("ID" + "     "+ "NAME" + "    " + "Chinese" + "   " + "English" + "    " + "Math" + "    " + "Avg");
        for (int i = 0; i < 5; i++) {
            System.out.println(ID[i] + "     "+ name[i] + "    "+ score[i] + "         "+ scores[i] + "         "+ scoress[i] + "      "+ Average[i]);
        }
            System.out.print("AVG" + "           " + Averagesubject[0] + "         " + Averagesubject[1] + "         " + Averagesubject[2]);
    }
}