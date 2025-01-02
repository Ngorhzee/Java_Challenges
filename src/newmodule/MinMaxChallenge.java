package newmodule;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber =Integer.MAX_VALUE;
        int maxnumber = Integer.MIN_VALUE;
        boolean quit = false;

            System.out.println("Enter A number or press any character to quit");
            while (!quit){
                if(scanner.hasNextInt()) {
                    int userinput = scanner.nextInt();

               if (userinput<minNumber){
                        minNumber = userinput;
                    }
                   else if(userinput>maxnumber){
                        maxnumber = userinput;
                    }
                }else {
                    System.out.println("Minumum number entered = "+minNumber);
                    System.out.println("Maximum number entered = "+maxnumber);
                    quit =true;
                }
            }

    }
}
