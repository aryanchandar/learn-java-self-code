package nestedforloop;
import java.util.Scanner;
public class pattern6 { 
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rows=2*n-1;
        //rows=2*n-1 means{2*n-1 times the row will be printed}
        for(int i=1;i<=rows;i++){
            if(i<=n){
                for(int j=1;j<=i;j++)
                //HERE THE FIRST PART  will be printed till i time loop will be excuted
                {
                    System.out.print("* ");
                }
            }
                else{
                    for(int j=1;j<=rows-i+1;j++)
                    //here the second part start hota h isliye usko rows-i+1 times print hogA
                     {
                     System.out.print("* ");
                    }
                }
                System.out.println();
                }
            }
        }
    
    
