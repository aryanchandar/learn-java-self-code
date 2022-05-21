package methods;

public class Introduction {
    public static void main(String[]args){
        int firstNo =34;
        int SecondNo =23;
        int result =maxOf(firstNo,SecondNo);//yaha pr method calling hua h & the greater value is store in result and it's been printed.....and one more thing int value is stored in result which has been obtain from the method int {line 14}(returntype )
     maxOf(100,200);
     maxOf(30);
     System.out.println(result);//from line 5 to line 9 we had called the method
     sayhi();//calling sayhi method or function(line 29) 
     sayhi();
  
    }
     static int maxOf(int a,int b)//here  int is a returntype which return integer value 
    // void maxOf(int a,int b) here if we write void instead of int then we will not write any return 0 statement at the end of the program & void function return nothing
    //here we have to remember that static function k aandhar aapnlog static  function hii call kr sakte hai 
    {
        if(a>b){
            return a;

        }else{
            return b;
        }
        //from line 14 to 23 we had created a method
        
        // return 0;
    }
    //line 29 and line 30 are example of method overloading 
    //static int maxOf(int c,int d);//it will   give error because in method overloading it should have different parameters
static int maxOf(float c);
static void sayhi()//here we are creating new method whose name is sayhi.
{
    System.out.println("hi");
    System.out.println("good morning");

}}
