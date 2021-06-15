package calismalar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class doLoopEx1 {
    public static void main(String[] args) {
        //Task 4
//use a do while loop to implement the Guessing the Number game. The program gives as
// many tries as the user needs to guess the number.
//if guess is correct print "You guessed the correct number.");
// if guess is smaller then your number print "Your guess is lower than the number.\nGuess again!");
// if guess is higher then your number print  "Your guess is higher than the number.\nGuess again!");
        Scanner scan=new Scanner(System.in);
    int a=200;
        int guess;
    do{
        System.out.println("Please guess the number");
        guess=scan.nextInt();
        if(guess>a){
            System.out.println("Your guess is higher than the number.\nGuess again!");
        }else if(guess<a) {
            System.out.println("Your guess is lower than the number.\nGuess again!");
        }
    }while( guess!=a );
        System.out.println("\"You guessed the correct number.\"");
    }

}



