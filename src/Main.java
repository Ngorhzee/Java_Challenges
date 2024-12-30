

public class Main {
    public static void displayHighScore(String playerName,int playerPosition){
        System.out.println(playerName+ " managed to get to position "+ playerPosition+  " on the highscore list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if(playerScore>=500){
            return  2;
        }else if(playerScore>=100){
            return  3;
        }else {
            return 4;
        }
    }
    public static long toMilePerHour (double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilePerHour(kilometersPerHour);
        if(miles== -1){
            System.out.println("Invalid Value");
        }else{

            System.out.println(kilometersPerHour+"km/h="+miles+"mi/h");
        }

    }
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
//        int player1Position = calculateHighScorePosition(1500);
//        displayHighScore("Ngozi",player1Position);
//        int player2Position = calculateHighScorePosition(999);
//        displayHighScore("Uche",player2Position);
//        int player3Position = calculateHighScorePosition(499);
//        displayHighScore("Success",player3Position);
//        int player4Position = calculateHighScorePosition(99);
//        displayHighScore("Fumnaya",player4Position);
//        int player5Position = calculateHighScorePosition(-100);
//        displayHighScore("Samuel",player5Position);

    }
}