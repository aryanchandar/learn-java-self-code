package Oops.interfaces;


//public class Person 
//public class Person extends Student
public class Person implements Student,YouTuber


{
    public static void main (String[]args){


        Person obj=new Person();
        // obj.study();
        // obj.makeVedio();




        
        //YouTuber obj2=new YouTuber();//this line will give error because we can't add new keyword to it because it doesn't has any constructor
YouTuber obj2=obj;//upcasting
//here obj was having both youtuber and student behaviour but after assigning obj2=obj it only accept the youtuber behaviour
obj2.editVedio();//we can access only youtuber behaviour
obj2.makeVedio();









    }

    @Override
    public void study() {
        // TODO Auto-generated method stub
        System.out.println("person is Studying");

        
    }

    @Override
    public void makeVedio() {
        // TODO Auto-generated method stub
        System.out.println("person is making a good vedio");
        
    }

    @Override
    public void editVedio() {
        // TODO Auto-generated method stub{

        System.out.println("person is editing ");
        
    }
    
}
