package encapsulation;

public class Student {
    
    private int age;
    private String name;
    //by line  5 & 6 we can't get access in other file(encapsulatinIntroduction)so we will get access through the getter abd setter method
    
    //getter & setter method
    //we will create function first that will  return age
    public int getAge(){
        return age;
    }
    //for set 
    public void setAge(int age){
        if(age>20){
            System.out.println("you are too old");
        }else
        {
             this.age=age;
            }       
    }
}