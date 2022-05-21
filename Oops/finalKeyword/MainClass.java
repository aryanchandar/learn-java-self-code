package Oops.finalKeyword;

import Oops.pack.mainclass;

//public class MainClass {
    // ek variable bna rhe h hai class k aandhar usko aapn phle initailise nhi krte th aur koi jarurat bhi nhi tha lekin final keyword use krne k baad ussi time aapn ko initialise kr dena nhi toh compiler compile time error dega
  /*
    //String rollNo;
    final int   ROLL_NO=01;
    public static void main(String[]args){
        // String name="anuj";
        // name="kumar";
        final String name="Anuj";
       //this local variable
       // name="kumar";
       //hence we had written the final keyword  we can't change the value of name from anuj to kumar
       System.out.println(name);
        
*/



/*
//final method
public class MainClass extends Student {
    //here overidding is been applied
    public void getDescription(){
        System.out.println("inside main class");
    }
public static void main(String[]args){
    //creating main class object 
    //due to inheritance
     MainClass obj= new MainClass();
     obj.getDescription(); 

*/





//next come final class
public class MainClass extends Student
//we can that it giving error on compile time so we can understand that after applying final keyword to class we can't extend it.
{


    }
}
