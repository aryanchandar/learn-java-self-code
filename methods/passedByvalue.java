package methods;

public class passedByvalue {
    public static void main(String[]args){
// int c = 34;
// int d=21;
// swap(c,d);//calling the method which has been created in line 
// System.out.println(c+ " " + d);//output will be 34 21


// Dog c=new Dog();
// c.legs=4;

// Dog d= new Dog();
// d.legs=5;
// swap(c, d);
// System.out.println(c.legs+ " " +d.legs  );//output will be 4 5.



//
Dog a= new Dog();
a.legs=4;
changeDog(a);
System.out.println(a.legs);//output will be 6

    }
     //here we are creating the swapimg function
     static void swap(int a,int b){
         int temp=a;
         a=b;
         b=temp;
     }


     //here we are dealing with the non primitive datatype name is Dog
     static void swap(Dog a,Dog b){
     Dog temp=a;
         a=b;
         b=temp;
     }


//here we are not swapping the no. we are change the leg 4 to leg 6
     static void changeDog(Dog dog){
         dog.legs=6;
     }

}
class Dog
{
    int legs;


}