package conditionalStatements;
public class SwitchCaseStatement
{
    public static void main (String[]args)
    {
        int Dayofweek=3;
        switch(Dayofweek){
            case 1:
            System.out.println("i am on leave");
            break;
            case 2:
            System.out.println("i'm in office");
            break;
            case 3:
            System.out.println("I'm playing football");
            break;
            default:
            System.out.println("I don't know what day it is");
        }
    
        }
    }