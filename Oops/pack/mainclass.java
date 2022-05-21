package Oops.pack;

import java.util.Scanner;
import java.util.*;//we are importing all the classes or file present in util package


// import Oops.pack.modelpackag2.ji;//importing ji file from package modelpackage2
// import Oops.pack.modelpackag2.teacher;
import Oops.pack.modelpackag2.*;//this line means we are importing all the package present in modelpackage2 by using *

public class mainclass {
    
    public static void man(String[]args)
    {
        //accessing the ji.java file in this file
       ji obj=new ji("tom");
       //teacher obj=new teacher();
       obj.name ="aryan";
       obj.getPassword();
       Scanner sc= new Scanner(System.in);
    }
}
