package day11;
public class c2_continueStatements {
    public static void main(String[] args) {
        //break will break whole loop or switch that you are using it
        //continue keyword will only skip current number you have
        for (int i = 0 ; i < 5 ;i++){
            System.out.println("Break"); // 0 1 2
            if (i==2){//2
                break; //2
                //it will break whhole loop to running
            }
            System.out.println("After Break keyword"); //0 1
        }
        for (int  i=0; i < 5 ;i++){ // 0 1 2 3
            System.out.println("Before Continue" + i); // 0 1 2 3 4
            if (i==2){ //2
                continue; //2 it will skip current number
                //but it wont break whole loop to running
            }
            System.out.println("After Continue" + i); // 0 1 3 4
        }
        //print only even numbers from 1 - 10
        // first way you can just look for if (i%2==0) and print
        //second way you can skip odd numbers by using continue
        for (int i =1 ; i <=10 ; i++){ //1 2 3 4
            //System.out.println(i); // 12 3 4 ..
            if (i%2 != 0){ //odd numbers // 1 3 ..
                // we dont want to see odd numbers
                continue; // this will skip odd numbers //1 3 ..
            }
            System.out.println(i); //2 4 ..
        }
        // create a java logic that will not print numbers that are divisible both by 2 and 3 from 1 to 20
        // anything left should  be priented
        // use continue statement
        //  1 2 3 4 5 7 8 9 10 ...20
    }
}