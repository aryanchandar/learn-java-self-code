package Oops.inheritance;

public class person {
 protected String name;

//here we learn super keyword so ingore before reading inheritance then go through this code
//here we are creating person name constructor
public person(String name){
this.name=name;
System.out.println("inside person constructor");
}

    public void walk(){
        System.out.println(name+" is walking");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    
}
