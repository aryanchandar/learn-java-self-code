//here we are drawing the patterns with the help of nested loop
package nestedforloop;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[]args)
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//we have to print * * * * in matrix form (4*4)here in pattern there are stars and space between them.So we have to print star and space parallely.
for(int j=1;j<=n;j++){
for(int i=1;i<=n;i++){
    System.out.print("* ");
}
System.out.println();
}
    }
    }
    

