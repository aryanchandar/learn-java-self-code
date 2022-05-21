package Oops.abstraction;

public abstract class Car 
//yaha aapn n class car jo tha usko abstract class car bna dia h aur isse aapn log ko yeah help milta h kii car ka object nhi bna sakte jo kii meaning less hai 
//abstract class tabhi bana h jb aapn ko confirm pta ho kii children class bna rhe h

{
   /*public void accelerate(){

    }
    public void breaking(){

    }
    */
    public  abstract void accelerate();//here we are creating abstract method so it is complusory that abstract class is also be there
    public abstract void   breaking();


    //abstract class k aandhar  non abstract method bhi hosakte hai usko bolte hai concrete method
    public void honk(){
        System.out.println("car is honking");
    }


 
    
}
