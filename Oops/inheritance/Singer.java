package Oops.inheritance;
public class Singer extends person{
    
    //here we learn super keyword so ingore before reading inheritance then go through this code
public Singer(String name){
    super(name);
}

    public void sing(){
        System.out.println(name+" is singing");
    }
    
}
