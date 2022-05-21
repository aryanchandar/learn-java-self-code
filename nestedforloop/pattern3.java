package nestedforloop;

//create a pattern * * * *
                 //  * * *
                 //    * *
                //       *
 //               
import java.util.Scanner;
public class pattern3{
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //external loop
        for( int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
                //above syntax print two gaps
            }
            for(int j=1;j<= n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }

 
    
}}
