import java.util.Scanner;

public class Problem98 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int totall = 0;
        String special_number = scn.next();
        String lottery_number[] = new String[3];
        for (int i = 0 ; i < 3 ; i++) {
            lottery_number[i] = scn.next();
        }
        int howmany = scn.nextInt();
        String invoice[] = new String[howmany];
        for (int i = 0 ; i < howmany ; i++){
            invoice[i] = scn.next();
        }
        int special = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        //判斷特獎
        for (int i = 0 ; i < howmany ; i++){
            if (invoice[i].equals(special_number)){
                totall += 2000000;
                special++;
            }
        }

        //判斷獲得多少錢
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < howmany ; j++){
                if (lottery_number[i].equals(invoice[j])){
                    totall += 200000;
                    one++;
                }else if (lottery_number[i].substring(1,7).equals(invoice[j].substring(1,7))){
                    totall += 40000;
                    two++;
                }else if (lottery_number[i].substring(2,7).equals(invoice[j].substring(2,7))){
                    totall += 10000;
                    three++;
                }else if (lottery_number[i].substring(3,7).equals(invoice[j].substring(3,7))){
                    totall += 4000;
                    four++;
                }else if (lottery_number[i].substring(4,7).equals(invoice[j].substring(4,7))){
                    totall += 1000;
                    five++;
                }else if (lottery_number[i].substring(5,7).equals(invoice[j].substring(5,7))){
                    totall += 200;
                    six++;
                }
            }
        }
        System.out.println(special + " " + one + " " + two + " " + three + " " + four + " " + five + " " + six + '\n' + totall);
    }
}
