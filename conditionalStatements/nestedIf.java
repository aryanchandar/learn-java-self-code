package conditionalStatements;

public class nestedIf {
    public static void main (String[]args)

    {
        int a=1;
        int b=2;
        int c=30;
        int res =0;
        if(a>b){
            if(a>c){
                res=a;
            }
            else{
                res=c;
            }

            
        }
        else{
            if(b>c)
            {
            res=b;
        }else{
            res=c;
        }
           
        }
        //shortcut in ternary operator
        // res=a>b?a>c?a:c:b>c?b:c;
        // System.out.println("largest of the three no.is  "+res);

    }
    
}
