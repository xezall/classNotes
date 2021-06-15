package studyHall_day1;

public class triangle {
    public static void main(String[] args) {
        // Write a program to print out a triangle like below by using while loop:
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */
        String result = "";
        for (int i = 0; i <= 7; i++) {
            result += "*";
            System.out.println(result);
        }
    }
}



