package Oops.pack.modelpackag2;

public class ji {
   
   //some name
private String name;
    //here private word is use to restrict the accessibility within this class it can't be accessable in other class.For accessing String in other class we can use public instead of private then we can use in other java files
    //public String name;
    public  ji(String name)//cretaing constructor
    {
        this.name=name;

    }
    
    public String getName(){
        getPassword();
        return name;//creating function

    }
    //creating public/private/default method 
     public String getPassword(){
        return"ashjcvashc";
    }
}
 