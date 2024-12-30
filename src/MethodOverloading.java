public class MethodOverloading {
    // This challenge practices method overloading
    public static double convertToCentimeters (int inches){
        double centimeters = inches *2.54;
        return  centimeters;
    }
    public static double convertToCentimeters (int feet,int inches){
        int totalInches = (feet*12)+inches;
       return convertToCentimeters(totalInches);
    }

    public static void main(String[] args) {
      double centimeters =  convertToCentimeters(68);
        System.out.println(centimeters);
    }
}
