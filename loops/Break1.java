package loops;

public class Break1 {
    public static void main(String[]args)
    {
    for(int i=1;i<=100;i++){
        if(i==35){
            break;
        }

        System.out.println(i);


    }
    
}}

//when i reach the value of 35 the break is applied any exit the loop by printing till 34.
