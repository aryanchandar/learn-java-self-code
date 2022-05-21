package loops;

public class tablefrom1to20 {
    public static  void main(String[] args)
    //here nested loop is been applied
    {
        for (int j=1;j<=20;j++ ){
            //below syntax is to print the multiple of 23 20 times

        //int tableOf=23;
        int tableOf=j;
        //above syntax means print the multiple  from  1 toh j<=20
        for(int i=1;i<=10;i++){   System.out.print(tableOf *i   + " "); 
    
    }
    //below syntax is for go on new line
    System.out.println();
    }
    
}}
 