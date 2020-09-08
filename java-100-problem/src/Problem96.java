import java.util.Scanner;

public class Problem96 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int number[] = new int[N];
        int count[] = new int[N];
        for (int i = 0 ; i < N ; i++){
            number[i] = scn.nextInt();
        }
        for (int i = 0 ; i < N ; i++){
            String num = Integer.toString(number[i]);
            int howlong = num.length();
            for (int j = 0 ; j < howlong ; j++){
                char word = num.charAt(j);
                count[i] += Character.getNumericValue(word);
            }
        }
        for (int i = 0 ; i < N ; i++){
            for (int j = i + 1 ; j < N ; j++){
                if (count[i] > count[j]){
                    int buffer = number[i];
                    int buffer2 = count[i];
                    number[i] = number[j];
                    count[i] = count[j];
                    number[j] = buffer;
                    count[j] = buffer2;
                }
            }
        }
        for (int i = 0 ; i < N ; i++){
            for (int j = i + 1 ; j < N ; j++){
                if (count[i] == count[j]){
                    if (number[i] > number[j]){
                        int buffer = number[i];
                        number[i] = number[j];
                        number[j] = buffer;
                    }
                }
            }
        }
        for (int i = 0 ; i < N ; i++){
            System.out.print(number[i]);
//            if (i != N - 1){
//                System.out.print(" ");
//            }
        }
        System.out.println();
    }
}
