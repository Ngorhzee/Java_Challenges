public class PerfectNumber {
    //This Challenge return true if the number is a perfect number
    //A perfect number is a positive integer which is equal to the sum of its proper positive divisors
    public static boolean isPerfectNumber(int num){
        if(num<1) return false;
        int sum =1;
        for (int i=2;i<=num/2; i++){
            if(num%i==0) {
                 sum+=i;
            }
        }
        if (sum==num) return true;
        return false;
    }

    public static void main(String[] args) {
        boolean isPerfect1 = isPerfectNumber(6);
        boolean isPerfect2 = isPerfectNumber(28);
        boolean isPerfect3 = isPerfectNumber(5);
        boolean isPerfect4 = isPerfectNumber(-1);

        System.out.println(isPerfect1);
        System.out.println(isPerfect2);
        System.out.println(isPerfect3);
        System.out.println(isPerfect4);
    }
}
