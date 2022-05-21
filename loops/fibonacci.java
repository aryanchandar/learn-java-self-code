//fibonacci (user input) 
package loops;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         int a=0;
         int b=1;
         //next jo line hai woh print karane k liye hai a aur b ko
         System.out.print(a+"");
         System.out.print(b+"");
         //hence we had printed 2 nos. a&b the we will write n-2for excute of the loop.
          //here we will apply for loop
           for (int i=0;i<n-2;i++){
               int c=a+b;
               System.out.print(c);
               //now we will store a value in b and b value in c;
               a=b;
               b=c;


           }

    }
}
