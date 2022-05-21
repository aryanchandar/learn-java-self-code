package Oops;
class cat{//here we are creating the class 
    boolean fur;//line 3,4,5 are the properties or state of the class cat
    String breed,color;
    int legs,eyes;
   
    public void walk(){//from line 7 to 15 we are declaring the behaviour of the class cat.
        System.out.println("cat is walking");
    }
    public void eat(){
        System.out.println("cat is eating");
    }
    public void description(){
        System.out.println("my cat has "+legs+"legs and"+eyes+"eyes");
    }

}
class dog{
    String breed,name;
    public void jump(){
        System.out.println("my dog "+name+" jumped");
    }
    public void description(){
        System.out.println("my dog's name is "+name+" and it's breed is "+breed);
    }

}
// public class elephant{

// }//koi bhi java ka file hogi usme ek hi public class hogi jo java ke file k name k barabr hoga.

public class mainClass {
    public static void main(String[]args) {
//         cat cat1= new cat();//here we are creating the object cat 1 from  class cat
//         cat cat2 =new cat();//2nd object cat 2
//         // cat1.walk();//. is use accessing the function of the class and walk is the behaviour 
//         // cat2.eat();
//         cat1.legs=3;//declaring the properties 
//         cat2.eyes=2;
         
//         cat2.legs=4;
//         cat1.eyes=1;
// cat1.description();
// cat2.description();  
//     }    





//here comes the creation of dog class
dog dog1=new dog();
dog dog2=new dog();
 
dog1.breed="husky";
dog1.name="browny";
dog2.breed="pomerian";
dog2.name="bikha";

dog1.jump();//calling the method 
// dog1.description();
// dog2.jump();
// dog2.description();


}}
