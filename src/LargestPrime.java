public class LargestPrime {
    /*
    Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

The method should calculate the largest prime factor of a given number and return it.

     */
    public static int getLargestPrime(int number){
        if(number<2) return -1;
        int largestPrime = -1;
        for (int i=2; i<=number/2;i++){
            if (number%i==0){
             if(   IsPrimeChalenge.isPrimeNumber(i)){
                 largestPrime = i;
             }
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
    }
}
