1package nestedforloop;
    import java.util.Scanner;
    public class pattern5 {
        public static void main(String[] args) {        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
//             for(int i=1;i<=n;i++)
//             {
//                 for(int j=1;j<=n-i;j++){
//                     System.out.print("  ");

//                 }
//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print("*  ");
//                 }
//                 System.out.println();
//             }
    
// }}
int no =1; 
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n-i;j++){
        System.out.print("  ");

    }
    for(int j=1;j<=i;j++)
    {
        System.out.print(no++ +"  ");
        //here no++ is for increasing the no. as they are printed
    }
    System.out.println();
}}}