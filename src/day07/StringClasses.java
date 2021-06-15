package day07;
//import java.lang.String; no need to import beacuse java will import automatiicaly anything starts with java.lang
public class StringClasses {
    public static void main(String[] args) {
        /*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.
            How to create a string object?
            There are two ways to create String object:
            1.By string literal
            2.By new keyword
 */
        //create an string object 1.By string literal
        //Java String literal is created by using double quotes. For Example:
        //
        //String str1="Hello";
        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        // For example:
        String str1="Hello"; //first it will check the pool and since i dont have Hello it is going to
        // // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        String str2="Hello"; // it doesnt create a new instance
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        //Why Java uses the concept of String literal?
        //To make Java more memory efficient
        // (because no new objects are created if it exists already in the string constant pool).
        //2.By new keyword
        String str3=new String("Hello");
        //String str3=new String("Hello");//creates two objects and one reference variable
        //In such case, JVM will create a new string object in normal (non-pool) java heap memory,
        // and the literal "Hello" will be placed in the string constant pool.
        // The variable str3 will refer to the object in a heap (non-pool).
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        // we have 2 different objects so that is why its false
        // even value is same object is different
        String s1="New York"; //placed on string constant pool
        s1="Virginia"; //new object will be placed as a Virginia
        //s1 refereances will be change from new york to virginia
        //in java string objects are immutable.
        //immutable means object unchangable  (cant be modify)
    }
}
