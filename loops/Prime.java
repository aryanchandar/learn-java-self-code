package loops;

import java.util.Scanner;

public  class Prime {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        //take input from use in a and b.
        int a=sc.nextInt(); 
        boolean isPrime=true;
        //condition for checking the given no which have to get by user is prime or not we declare 
        //here for loop is applied
        //loop will start from 2 because every no is multiple by 1.
        //
        for(int i=2;i<a;i++){
            //check whether remaindor is zero or not. 
            if(a%i==0){ 
                isPrime =false;
                //by using break here will we be automatic exit from the for loop
                break;

                 
            }
              
        }
        if (a<2){
            isPrime=false;
        } 
       System.out.println("is Prime" + isPrime);

    
}
}
//when user given 1 as input to the computer it never enter in loop because i=2,i<n.
// if (a<2){   isPrime=false; because 1 is non prime no.
