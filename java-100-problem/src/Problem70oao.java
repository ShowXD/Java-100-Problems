import java.util.Scanner;

public class Problem70oao {
    public static void main(String args[]){

        //設立變數
        int space = 0;
        int array = 0;

        //等待玩家輸入
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();

        //取這個字串有多長
        int howlong = sentence.length();

        //逐一取字判斷
        for (int i = 0 ; i < howlong ; i++){
            char word = sentence.charAt(i);
            if (word == ' '){
                space++;
            }
        }

        //設立陣列
        int number[] = new int[space + 1];

        //把數字裝進陣列
        for (int i = 0 ; i < howlong ; i++){
            char word = sentence.charAt(i);
            if (word != ' '){
                number[array] = Character.getNumericValue(word);
                array++;
            }
        }

        System.out.println();
    }
    public static int merge(int a,int b){
        if (a > b){
            return 0;
        }else {
            return merge(b , a);
        }
    }
}
