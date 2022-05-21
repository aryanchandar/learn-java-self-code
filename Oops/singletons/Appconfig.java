package Oops.singletons;
//here we are going to create singleton pattern
//in singleton pattern there is only one object for one class
public class Appconfig {
    private Appconfig(){
         
}

//creating object
    private static Appconfig obj=new Appconfig();
    
//apn ab ek static function banayenge kisko kii aapn class k naam se access kr sakte hai aur obj ko return karega
    public static Appconfig getInstance(){
//get instance ka kaam hai ek instance banega aur return hoga
   return obj;
}}

