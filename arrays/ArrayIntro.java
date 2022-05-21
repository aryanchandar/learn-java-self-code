package arrays;

public class ArrayIntro {
    public static void main(String[]args){
        //below are the different ways of declaration of the arrays.
         //int[]marks=new int[5];
         
         //int[]marks;
         //marks=new int[5];
         
         //int marks[]=new int[5];
         //[5] means its occupies space in memory of size (int) datatype and continuously memory block or location  are reserve in this

         //int marks[],classes[]; // in this code we are declaring two variable with one datatype that means it is multiple array.
// initailisation of array
int [] age={23,98,99,23,89};
// double[]marks={1.2,2.3,99.2,21.1,12.07};
// //System.out.println(marks[0]);
// //System.out.println(marks[3]); 
//  //aapnlog marks m jo value h 2nd position pr uska value ko change kr sakte hai
//  marks[1]=3982.0;
//  System.out.println(marks[1]);

//now we will get all the value of variable age  
//with the help of loops
// System.out.println(age[0]);
// System.out.println(age[1]);
// System.out.println(age[2]);
// System.out.println(age[3]);


//          OR

for(int i=0;i<age.length;i++)
//age.length(means it will calculate the length of the array "age")
{
    System.out.println(age[i]);

}









}
    
}
