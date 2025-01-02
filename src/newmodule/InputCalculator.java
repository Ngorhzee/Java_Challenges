package newmodule;

import java.util.Scanner;


public class InputCalculator {
    /*
    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
     */
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int sum = 0;
        long avg =0;
        int totalInput = 0;

        while (!quit){
            System.out.println("Enter a number or press any character to quit:" );
            if (scanner.hasNextInt()){
                int userInput = scanner.nextInt();
                sum+=userInput;
                totalInput++;
            }else {
                double avarage = (double) sum/totalInput;
                avg =  Math.round(avarage);
                System.out.println("SUM = "+sum+ " AVG = "+ avg);
                quit=true;
            }

        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
