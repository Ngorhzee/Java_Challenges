public class SecondAndMinutesChallenge {
    public static String convertToHours (int seconds){
       if(seconds<0){
           return "Invalid Time";
       }
        int minutes = (int) seconds / 60;

        int secondsRemaining = seconds %60;

        int hours =(int) minutes/60;
        minutes = minutes%60;
        return hours+"h "+minutes+"m "+secondsRemaining+ "s";
    }

    public static  String convertToHours(int minutes, int seconds){
        if(minutes<0){
            return "Invalid Time";
        }
        if(seconds<0 || seconds>59){
            return "Invalid Number of seconds";
        }
        int totalSeconds = (minutes*60)+seconds;
        return convertToHours(totalSeconds);
    }

    public static void main(String[] args) {
       String totalTime = convertToHours(-65,45);
        String totalTime3 = convertToHours(65,145);
        String totalTime2 = convertToHours(-3945);
        System.out.println(totalTime);
        System.out.println(totalTime2);
        System.out.println(totalTime3);
    }
}
