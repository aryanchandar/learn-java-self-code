//how to calculate the factorial of a no. which is given by user(for loop)
package loops;
import java.util.Scanner;
public class factorial {
    public  static void main (String[]args)
    {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int factorial=1;
       for(int i=n;i>=1;i--){
           factorial=factorial*i;
       }System.out.println(factorial);       
    }
}
