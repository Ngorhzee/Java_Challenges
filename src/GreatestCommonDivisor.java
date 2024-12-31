public class GreatestCommonDivisor {
    // This Challenge finds the highest divisor between two numbers
    public static int getGreatestCommonDivisor(int num1,int num2){
        if(num1<10||num2<10) return  -1;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int greatestFactor = getGreatestCommonDivisor(10,15);
        int greatestFactor2 = getGreatestCommonDivisor(11,13);
        System.out.println(greatestFactor);
        System.out.println(greatestFactor2);
    }
}
