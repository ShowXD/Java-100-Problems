import java.util.Scanner;

public class Problem67 {
    public static void main(String args[]) {

        String Answer = "";
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        //測量文字長度
        String sentence = String.valueOf(number);
        int howlong = sentence.length();

            switch (howlong) {
                case 1:
                    Answer = Digits(number , true);
                    break;
                case 2:
                    if (number >= 10 && number <= 19) {
                        Answer = AboutTen(number);
                    } else {
                        if (number % 10 == 0){
                            Answer = TenDigits(number / 10) + Digits(number % 10 , false);
                        }else {
                            Answer = TenDigits(number / 10) + " " + Digits(number % 10 , true);
                        }
                    }
                    break;
                case 3:
                    if (number % 100 >= 10 && number % 100 <= 19){
                        Answer = HundredDigits(number / 100) + " " + AboutTen(number % 100);
                    }else {
                        if (number % 10 == 0){
                            Answer = HundredDigits(number / 100) + " " + TenDigits(number);
                        }else {
                            Answer = HundredDigits(number / 100) + " " + TenDigits(Character.getNumericValue(sentence.charAt(1))) + " " + Digits(Character.getNumericValue(sentence.charAt(2)) , true);
                        }
                    }
                    break;
                case 4:
                    if (number % 100 >= 10 && number % 100 <= 19){
                        Answer =ThousandsOfDigits(number / 1000) + " " + HundredDigits(Character.getNumericValue(sentence.charAt(1))) + " " + AboutTen(number % 100);
                    }else {
                        if (number % 10 == 0){
                            Answer =ThousandsOfDigits(number / 1000) + " " + HundredDigits(Character.getNumericValue(sentence.charAt(1))) + " " + TenDigits(Character.getNumericValue(sentence.charAt(2)));
                        }else {
                            Answer =ThousandsOfDigits(number / 1000) + " " + HundredDigits(Character.getNumericValue(sentence.charAt(1))) + " " + TenDigits(Character.getNumericValue(sentence.charAt(2))) + " " + Digits(number % 10 , true);
                        }
                    }
                    break;
                default:
                    System.out.print("輸入的數字太長，我才不處理呢。哼!");
            }
        System.out.println(Answer);
    }

    public static String Digits(int number , boolean flag) {
        String Answer = "";
        if (flag) {
            switch (number) {
                case 0:
                    Answer = "zero";
                    break;
                case 1:
                    Answer = "one";
                    break;
                case 2:
                    Answer = "two";
                    break;
                case 3:
                    Answer = "three";
                    break;
                case 4:
                    Answer = "four";
                    break;
                case 5:
                    Answer = "five";
                    break;
                case 6:
                    Answer = "six";
                    break;
                case 7:
                    Answer = "seven";
                    break;
                case 8:
                    Answer = "eight";
                    break;
                case 9:
                    Answer = "nine";
                    break;
            }
        }
        return Answer;
    }

    public static String AboutTen(int number){
        String Answer = "";
        switch (number){
            case 10:
                Answer = "ten";
                break;
            case 11:
                Answer = "eleven";
                break;
            case 12:
                Answer = "twelve";
                break;
            case 13:
                Answer = "thirteen";
                break;
            case 14:
                Answer = "fourteen";
                break;
            case 15:
                Answer = "fifteen";
                break;
            case 16:
                Answer = "sixteen";
                break;
            case 17:
                Answer = "seventeen";
                break;
            case 18:
                Answer = "eighteen";
                break;
            case 19:
                Answer = "nineteen";
                break;
        }
        return Answer;
    }

    public static String TenDigits(int number){
        String Answer = "";
        switch (number) {
            case 2:
                Answer = "twenty";
            break;
            case 3:
                Answer = "thirty";
            break;
            case 4:
                Answer = "forty";
            break;
            case 5:
                Answer = "fifty";
            break;
            case 6:
                Answer = "sixty";
            break;
            case 7:
                Answer = "seventy";
            break;
            case 8:
                Answer = "eighty";
            break;
            case 9:
                Answer = "ninety";
            break;
        }
        return Answer;
    }

    public static String HundredDigits(int number) {
        String Answer = "";
        switch (number) {
            case 1:
                Answer = "one hundred";
                break;
            case 2:
                Answer = "two hundred";
                break;
            case 3:
                Answer = "three hundred";
                break;
            case 4:
                Answer = "four hundred";
                break;
            case 5:
                Answer = "five hundred";
                break;
            case 6:
                Answer = "six hundred";
                break;
            case 7:
                Answer = "seven hundred";
                break;
            case 8:
                Answer = "eight hundred";
                break;
            case 9:
                Answer = "nine hundred";
                break;
        }
        return Answer;
    }

    public static String ThousandsOfDigits(int number){
        String Answer = "";
        switch (number) {
            case 1:
                Answer = "one thousand";
                break;
            case 2:
                Answer = "two thousand";
                break;
            case 3:
                Answer = "three thousand";
                break;
            case 4:
                Answer = "four thousand";
                break;
            case 5:
                Answer = "five thousand";
                break;
            case 6:
                Answer = "six thousand";
                break;
            case 7:
                Answer = "seven thousand";
                break;
            case 8:
                Answer = "eight thousand";
                break;
            case 9:
                Answer = "nine thousand";
                break;
        }
        return Answer;
    }
}