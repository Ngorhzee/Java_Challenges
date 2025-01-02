package newmodule;

import java.util.Scanner;


public class InputCalculator {
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
