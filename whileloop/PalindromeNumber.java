package whileloop;
import java.util.Scanner;
public class PalindromeNumber {
 public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
     int temp=n;
     int reversedNumber =0;

     //in temp no. is stored which is given by user because further operataion the no. can be lost.
     //reversedNumber is the variable to reverse no.
      
      while(temp>0){
       int lastDigit=temp%10;
        reversedNumber=reversedNumber*10+lastDigit;
         temp/=10;//reinitialisation
      }  
      if(reversedNumber==n){
          System.out.println(n+"is palindrome");
      }else{
          System.out.println(n+"is not palindrome");
      }
    }
}
