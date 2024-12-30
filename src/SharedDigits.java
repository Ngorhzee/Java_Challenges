public class SharedDigits {
    //This Challenge check for mutual digits in two numbers;
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int temp = secondNumber;
        while (firstNumber != 0) {
            int currentNumber = firstNumber % 10;
            if(secondNumber==0){
                secondNumber=temp;
            }
            while (secondNumber != 0) {
                int currentNumber2 = secondNumber % 10;
                if (currentNumber2 == currentNumber) {
                    return true;
                }
                secondNumber = secondNumber / 10;
            }
            firstNumber = firstNumber / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean test = hasSharedDigit(12, 13);
        boolean test2 = hasSharedDigit(100000000, 23456);
        boolean test3 = hasSharedDigit(1223456, 90);
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
    }
}
