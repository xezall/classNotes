package day02;

public class c6_String {

    public static void main(String[] args){
        String name="Ceylan";
        String companyName="Amazon";
        String companyName2="Renastech";
        double salary=110000.00;
        System.out.println("Name : " + name + " Company Name :" + companyName2 + " Salary : "+ salary);
        //printing them in new lines
        System.out.println("Name : " + name + "\nCompany Name :" + companyName2 + "\nSalary : "+ salary);
        // to make println concat different variables you need to use  +
        String number="100000"; // this is still word characters

        System.out.println(salary+10); //110010.00 both variable is number so t will sum both
        System.out.println(number+10); //100000+10:10000010 since your have string it is going to concat

        int i1=7;
        int i2=8;

        String s1="7";
        String s2="8";
        System.out.println(i1+i2); //both are number it is going to sum them
        System.out.println(s1+s2); //7+8==78if we have string it is going to concat them

        System.out.println(s1+i1); //7 (word)+7(number)=77
    }
}


