package Oops.polymorphism;

public class MainClass {
    public static void main(String[]args) {
        Dog d= new Dog();
    pet p=d;
System.out.println(d.name);//here we now that method can be overridded but variable can't be overidded.
System.out.println(p.name); 




    // Animal a=d;//upcasting horha hai yaha pr

    //  d.walk();
    //  p.walk();

     //a.walk();// yeah line error dega kyunki animal m walk function nhi hai aur yeah jo check horha hai compiler k through saath saath horha h bina run kiye isliye isko runtime polymorphism bolte hai




     /*ek aur baat d.walk();
     p.walk();
     yeah dono line jb run hoga output aapn ko Dog is walking hii milega dono function ko call karne pr kyu ....kyunki isne run time m hiii check kiye yeah object kis cheez ka hai ya kiska instance hai yeah toh dekha kii yeah d object jo hai Dog ka object aur p bhi d(dog )ka object hai aur  a bhi dog wla object hai */
      
   




     //here we will see compile time polymorphism
     //method overloading ko hii aapn compile time polymorphism kehte hai

     //greetings();//here first function is calling

     //greetings("hascjhas");// here second function is been called.

     //by the above line in each case the method calling pr hiii pata lg jata hai kii kaunsa function call krna h in case of method overloading issi ko compile time polymorphirm kehte hai

     //greetings("hvcaj",7);//here thirdfunction is been called

    }
    public static void greetings()//static function create kiye hai kyunki main m call krna hai greetings ko
    {
        System.out.println("hi,there");
    }
    public static void greetings(String s){
        System.out.println(s);

    }
    public static void greetings(String s,int count){
        for(int i=0;i<count;i++){
            System.out.println(s);
        }
    }
    
}
