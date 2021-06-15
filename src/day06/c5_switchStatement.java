package day06;

public class c5_switchStatement {
    public static void main(String [ ] args) {
        int month = 1;

        String monthName;

        switch (month) {
            case 1:
                monthName = "jan";
                break;
            case 2:
                monthName = "feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                monthName = "Invalid Number";
                break;
        }
        System.out.println(monthName);
        //without break statement
        char ch1 = 'D';
        String result = "Hello ";
        // 3 case which is A B C
        switch (ch1) { //C
            case 'A':
                result += "A"; // hello A
            case 'B':
                result += "B"; //hello AB
                //break;// break stop switch
            case 'C':
                result += "C";
            default: //when you dont have any match default will be run like else
                result += "invalid";
        }
        System.out.println(result);
    }
}
