package Oops.inheritance;

public class teacher extends person {//here we are implimenting inhertiance by using extends keyword in right side of keyword there should be parent class and on the left side there should be child class

//here we learn super keyword so ingore before reading inheritance then go through this code
public teacher(String name){
    super(name);
    System.out.println("inside teacher constructor");
}





    public void teach(){
        System.out.println(name+" is teaching");
    }
    public void eat(){

        //here we are decalring super keyword for understanding
        //super.eat();
        //by applying super keyword first we are accessing the super one then system.out.println one
         System.out.println("teacher"+name+"is eating");
    }
}
