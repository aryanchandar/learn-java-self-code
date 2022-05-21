package dowhile;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[]args){
    //     int n=0;
    //     do{
    //         System.out.println("n is"+n);
    //     }while(n!=0);
    //     //here we first declare the n=0 and then in condition we write n is not equal to zero so in this we first enter in loop and then check the given condition that why in these situation only one time loop runs.
    // }
    Scanner sc = new Scanner(System.in);
    int n=1;
    do{
        n=sc.nextInt();
        System.out.println("number" +n);
    }while (n!=0);
}}
