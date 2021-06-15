package calismalar;

public class ex2 {
    public static void main(String[] args) {
        //between 100 and 1 all odd number
        for (int i = 50; i <= 50 && i > 0; i--) {
            System.out.println("" + (2 * i - 1));
        }
        //the whole numbers between 1 and 100 which is divisible by 3 and 7

        for (int i = 1; i <= 100; i++) {
            if (i % 21 == 0) {
                System.out.println("" + i);
            }
        }


        }
    }
