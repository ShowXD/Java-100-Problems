import java.util.Scanner;

public class Problem83oao {
    public static void main(String args[]){
        //啟用工具
        Scanner scn = new Scanner(System.in);

        //等待輸入
        int howmany = scn.nextInt();

        //定義全域變數
        int count = 0;
        String xu[] = new String[howmany + 1];

        //把輸入進來的抓起來
        for (int i = 0 ; i < howmany + 1 ; i++){
            xu[i] = scn.nextLine();
        }

        //把輸入的分開
        for (int i = 1 ; i < howmany + 1 ; i++){
            int howlong = xu[i].length();
            for (int j = 0 ; j < howlong ; j++){
                char word = xu[i].charAt(j);
                if (word != ' '){
                    System.out.print(word);
                }
            }
            System.out.println();
        }
    }
}
