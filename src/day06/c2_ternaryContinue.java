package day06;

public class c2_ternaryContinue {
    public static void main(String[] args){
        // if else if else if else with ternary
        //this task :
        //create a java program that takes score of student and prints the grade of student
        //between 100 to 85 is grade A
        //between 70 to 84 is grade B
        //between 60 to 69 is grade C
        //between 40 to 59 is grade D
        //between 0 to 39 is grade F
        //if number is not between 0-100 grade 0 ,,"invalid number"

            int score = 90 ;
            char grade= '0';
            String str= " " ;
            if (score >= 85 && score<=100) {
                //between 100 to 85 is grade A
                grade = 'A' ;
            }else if (score >=70 && score < 85){
                //between 70 to 84 is grade B
                grade = 'B' ;
            }else if(score >= 60 && score <70){
                //between 60 to 69 is grade C
                grade ='C';
            }else if (score >= 40 && score < 60){
                //between 40 to 59 is grade D
                grade ='D';
            }else if (score >=0 && score <40){
                grade='F';
            }else{
//            grade='0';
                str= "invalid number";
            }
            System.out.println("student grade is : "+grade);
            if (grade=='0'){
                System.out.println(str);
                System.out.println("Student was absent");
            }
            //ternary
            //if ?
            //else :
            //: () ?   ----> else if
            char grade2= (score >= 85 && score<=100) ? 'A' : (score >=70 && score < 85) ? 'B'
                    : (score >= 60 && score <70) ? 'C' : (score >= 40 && score < 60) ? 'D'
                    : (score >=0 && score <40) ? 'F' : '0' ;
            System.out.println( "grade 2 is " + grade2);
        }
    }