public class PrintFactors {
    // This challenge prints out the factors of a given number
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Number");
            return;
        }
        for (int i =1; i<=number/2;i++){
         if(number%i==0){
             System.out.println(i);
         }
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        printFactors(11);
    }
}
