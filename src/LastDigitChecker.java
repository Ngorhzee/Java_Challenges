public class LastDigitChecker {
    //This Challenge checks the last digit of 3 number and returns true if at least two of the numbers have the same last digit
    public static boolean hasSameLastDigit (int first,int second,int third){

        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;

        return firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit || secondLastDigit == thirdLastDigit;
    }


}
