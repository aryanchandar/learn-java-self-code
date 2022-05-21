package Oops.xyzstatic;

class test{
//     void display(){
//         System.out.println("1");
//     }
//     public static void main(String[]args){
//         test t=new test();
//         t.display();
//     }
// }


//by static method we can directly call the method display with in the same class
//it can called by directly or by class name
 static void display(){
    System.out.println("1");
}
public static void main(String[]args){
    //below the different ways of calling method
    //display();
    test.display();
    xyz.show();
}
}
class xyz{
static void show(){
    System.out.println("2");
}
}