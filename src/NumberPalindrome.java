public class NumberPalindrome {
    // This challenge check if a given number is a palindrome or not
    public static boolean isPalindrome(int number){

        int temp = number;
        int reverse =0;
        int lastdigit=0;
        while (number!=0){
           lastdigit = number%10;
           reverse = (reverse*10)+lastdigit;
          number=  number/10;
        }

       if(temp==reverse){
           return true;
       }
        return  false;
    }

    public static void main(String[] args) {
        isPalindrome(-123);
    }
}
