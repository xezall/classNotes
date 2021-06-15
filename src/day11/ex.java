package day11;

public class ex {
    public static void main(String[] args) {
        // create a java logic that will not print numbers that are divisible both by 2 and 3 from 1 to 20
        // anything left should  be priented
        // use continue statement
        //  1 2 3 4 5 7 8 9 10 ...20
        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0 && i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

