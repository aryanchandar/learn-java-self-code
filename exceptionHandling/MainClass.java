package exceptionHandling;

public class MainClass {
    public static void main(String[]args){
        
        // int a=5;
        // int b=4;
        // int c=a/b;
        //till here there is no exception in code




        // int a=5;
        // int b=0;//here we will get excetion in thread (Arithemetic Exception)
        // int c=a/b;        
        // System.out.println(c);




        //solution for exception 
        //by the help of try n catch keyword we will handle the exception
       /*
        
        try{
    //        int a=5;
    //        int b=0;
    //        int c=a/b;
    //        System.out.println(c);//this line will be not printed
      
    
    
    //here below we are writing the code for the ArrayIndexOutOfBoundsException
    int a[]=new int[5];
    System.out.println(a[6]);




        }
       catch(ArithmeticException e)//here e is exception object
       {
        System.out.println(e.getMessage()+" occured, please check the code");
       }
       //type of exceptions


    //    catch(ArrayIndexOutOfBoundsException e){
    //        System.out.println("index should be in the range 0 to size of array.");

       //}
       catch(IllegalArgumentException e){
           System.out.println("check your casting carefully");
       }
       finally//here finally is a keyword that run for both condition first condition is if we get the exception this finallykeyword will run or if we not get the exception then also we will see that finally keyword is executed
       {
           System.out.println("Sorry for the inconvenience. ");
       }
       
       System.out.println("very imp code");
       System.out.println("need to run");

       /*hence we can see that after applying try & Catch keyword the
       both line is been execute or printed and  System.out.println("very imp code");
    System.out.println("need to run")

but if we are not handling exception the twoline will be not able to print because the code will be stuck due to exception

this handling exception are use when your code is very imp you need that code to be execute then we apply try n catch keyword to exception code not on that imp code.



    */




 // fun1();
   /* }
static void fun1(){
           int a=5;
           int b=0;
           int c=a/b;
           System.out.println(c);/*Exception in thread "main" java.lang.ArithmeticException: / by zero
           at exceptionHandling.MainClass.fun1(MainClass.java:58)
           at exceptionHandling.MainClass.main(MainClass.java:53)*/ 


/*

//here throw keyword is implemented
fun1();
    }
           static void fun1(){
               int a=5;
               int b=3;
               int c=a/b;
               System.out.println(c);
               boolean isDanger=true;
               if(isDanger){
                   throw new ArrayIndexOutOfBoundsException("danger alert");//new ArrayIndexOutOfBoundsException("danger alert");means that every exception throw keyword has to create a exception object
               }
            }}*/
            
            
            
            
  

fun1();
        }

  //THROWS KEYWORD 
  static void fun1(){
    int a=5;
    int b=3;
    int c=a/b;
    System.out.println(c);
    try{
        fun2();
    }
    catch(Exception e){
        System.out.println(e.getMessage()+"occured");
    }
    } 
    static void fun2()throws ArrayIndexOutOfBoundsException{
        boolean isDanger=true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("danger alert");
        }
    }}


           
            



