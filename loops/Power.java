package loops;
import java.util.Scanner;
  
public class Power {
    
  
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            //take input from use in a and b.
            int a=sc.nextInt();
            int b=sc.nextInt();

            //here we will create result(name of the variable use to multiple with a  till b times  )
            int result =1;
             //applied here for loop

             for(int i=0;i<b; i++){
                 result*=a;
                 

             }
             System.out.println(result);
            
            }


}
