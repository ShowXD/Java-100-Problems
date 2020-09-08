import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {

        int xu[] = new int[5];
        int fail = 0;
        int low, high;

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            xu[i] = scn.nextInt();
        }

        //全班平均
        System.out.println((xu[0] + xu[1] + xu[2] + xu[3] + xu[4]) / 5);

        //不及格人數
        for (int i = 0; i < 5; i++) {
            if (xu[i] < 60) {
                fail++;
            }
        }
        System.out.println(fail);

        //最高分
        high = xu[0];
        for (int i = 0; i < 4; i++) {
            if (xu[i] < xu[i + 1]) {
                high = xu[i + 1];
            }
        }
        System.out.println(high);

        //最低分
        low = xu[0];
        for (int i = 0; i < 4; i++) {
            if (xu[i] > xu[i + 1]) {
                low = xu[i + 1];
            }
        }
        System.out.println(low);
    }
}