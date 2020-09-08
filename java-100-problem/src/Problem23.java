import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args){

        //設立變數
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        int price = scn.nextInt();

        //轉換成英文

        //測量文字長度
        String stringValue = String.valueOf(price);
        int howlong = stringValue.length();

        int p = howlong;
        //分別顯示數字
        for (int i = 1; i<=howlong ; i++) {
            char x = stringValue.charAt(p-1);
            p = p - 1;
            switch (i){
                case 1:
                    r = Character.getNumericValue(x);
                    break;
                case 2:
                    e = Character.getNumericValue(x);
                    break;
                case 3:
                    w = Character.getNumericValue(x);
                    break;
                case 4:
                    q = Character.getNumericValue(x);
                    break;
            }
        }

        if ( q != 0){
            System.out.println(q+" thousand "+w+" hundred "+e+" ten "+r+" dollar");
        }else if (w!=0){
            System.out.println(w+" hundred "+e+" ten "+r+" dollar");
        }else if (e !=0){
            System.out.println(e+" ten "+r+" dollar ");
        }else if (r !=0){
            System.out.println(r+" dollar");
        }else{
            System.out.println(0+" dollar");
        }
    }
}
