public class EvenDigiSum {
    public static int getEvenDigitSum(int number) {
        String numberString = "" + number;
        String[] strArray = numberString.split("");
        int sum = 0;
        for (String i : strArray) {

            if (Integer.parseInt(i) % 2 == 0) {
                sum += Integer.parseInt(i);
            }
        }
        return number < 0 ? -1 : sum;
    }

    public static void main(String[] args) {
        int sum = getEvenDigitSum(1234567);
        System.out.println(sum);
    }

}
