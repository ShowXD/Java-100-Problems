import java.util.Scanner;

public class Problem95 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int howmany = scn.nextInt();
        String sentence[] = new String[howmany + 1];
        for (int i = 0 ; i < howmany + 1 ; i++){
            sentence[i] = scn.nextLine();
        }
        for (int i = 1 ; i < howmany + 1 ; i++){
            int count = 0;
            for (int j = 0 ; j < sentence[i].length() ; j++){
                char word = sentence[i].charAt(j);
                count +=word;
            }
            System.out.println(count);
        }
    }
}
