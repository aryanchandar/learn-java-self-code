package lists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[]args){
     /*
        ArrayList fruits=new ArrayList();
        fruits.add("Apple");
        fruits.add(23);

System.out.println(fruits);//here we are getting the output without applying generic concept
*/


/*
//here we will see the generic concept<Type>
 

ArrayList <String>fruits= new  ArrayList();
fruits.add("Apple");
fruits.add("Orange");
//fruits.add(23);//error dega kyunki <String> toh int nhi daal sakte hai aur yaha generic kaam kr rha h 

System.out.println(fruits);
ArrayList <Integer>marks=new ArrayList();
*/



//pair wle k liye hai
Pair<String,Integer>p1=new Pair("Anuj",457);
Pair<Boolean,String>p2=new Pair(true,"Hello");
p1.getDescription();
p2.getDescription();

    }
}
