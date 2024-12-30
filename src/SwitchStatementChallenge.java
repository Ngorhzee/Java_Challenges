public class SwitchStatementChallenge {
    public static String getNatoWord(char letter){
        switch (letter){
            case 'A':
              return letter+ " = Able";
            case 'B':
                return letter+ " = Baker";

            case 'C':
                return letter+ " = Charlie";

            case 'D':
                return letter+ " = Dog";

            case 'E':
                return letter+ " = Easy";

            default:
                return "Letter "+letter+" Not Found";
        }
    }

    public static void printWeekDay(int day){
        String dayOfTheWeek = switch (day){
            case 0 ->  "Day 0 is Sunday";

            case 1->
               "Day 1 is Monday";

            case 2-> "Day 2 is Tuesday";

            case 3->   "Day 3 is Wednesday";

            case 4->  "Day 4 is Thursday";

            case 5-> "Day 5 is Friday";

            case 6->  "Day 6 is Saturday";

            default ->  "Invalid Day";


        };
        System.out.println(dayOfTheWeek);
    }

    public static void main(String[] args) {
        //System.out.println(getNatoWord('A'));
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }
}
