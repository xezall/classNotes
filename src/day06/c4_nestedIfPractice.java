package day06;

public class c4_nestedIfPractice {
    public static void main(String[] args) {
        String personName = "Gultekin";
        int age = 43;
        double weight = 64.3;
        String result = "";

        if (age > 18) {
            if (weight > 50.0) {
                result = personName + "is eligible to give blood";
            } else if (weight <= 50.0) {
                result = personName + "is not eligible to give blood";


            } else {
                result = personName + "needs to be older then 18";
            }
            System.out.println(result);
        }
    }
}
