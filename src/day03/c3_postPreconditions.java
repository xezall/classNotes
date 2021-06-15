package day03;

public class c3_postPreconditions {

    public static void main(String[] args){
        // pre : this will change the value of number immediately
        // post : first wont gonna change anyhting on the variable , at the end it will change it
        int x =10 ;
        System.out.println(x); //10
        System.out.println(++x); // pre condition will increase the number 11
        System.out.println(x); // 11
        System.out.println(++x); //12
        System.out.println(+x); // this wont change number value it is effecting either postitive or negative
        int y = 20 ;
        System.out.println(y);//20
        System.out.println(--y); // pre condition will decrease the number 19
        //post
        int z=10 ;
        System.out.println( z++); //post will increase the number on next steps not immmediatly
        System.out.println( z );
        int w = 20 ;  //20
        System.out.println( w-- ); //post will decrease the number on next steps not immmediatly // 20 on next 19
        System.out.println( w-- ); //it will be still 19 on next line will be 18
        System.out.println("********************************");
        int i1= 15 ; // 15
        System.out.println( -- i1 ); // pre  this line 14  next line  i1=14
        System.out.println( i1++ );  // post  this line wont be effected because it is post so 14 but on next line i1=15
        System.out.println( i1 ); // no post pre cond this line 15 next line 15
        System.out.println( ++ i1); //pre this line 16  next one still 16
    }
}