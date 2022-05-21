//user se phle kitna bacha h uska input lega fir kitna marks aaya h har bacha ka woh user input dega fir uska average calculate hoga.

package arrays;

import java.util.Scanner;

public class ArverageMarksOfStudent {
    public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no. of students:");
     int n=sc.nextInt();//user se phle kitna bacha h uska input lega
     int marks[]=new int[n];//marks will store in form of array from the user
     System.out.println("enter the marks now:");
     for(int i=0;i<n;i++){
marks[i]=sc.nextInt();

     }
     int averageMarks=0;//average calculate hoga uske liye variable declare kr rhe hai jisme average value store hoga
for(int i=0;i<n;i++){
    averageMarks+=marks[i];//yeah step pr jitna marks user dega marks[0],marks[1].....sb add hoga aur averageMarks m store hojayega. 

}averageMarks/=n;
System.out.println("the average marks are"+averageMarks);





    }
    
}
