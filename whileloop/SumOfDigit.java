package whileloop;
import java.util.Scanner;
public class SumOfDigit {
         public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp =n;
        int sum=0;
        //temp is a variable which stores the value given by user
        //int temp =n;here we initialise the value
        //  int sum=0;here the sum is store
        while(temp>0)
        //temp>0 here is the condition
        {
          int lastDigit= temp%10;
temp/=10;//temp/=10;reinitialisation
sum+=lastDigit;
System.out.println(lastDigit+" "+ temp+" "+sum);
        }
        System.out.println("the sum of digit of "+n+" is "+sum);
    }
    
} 
