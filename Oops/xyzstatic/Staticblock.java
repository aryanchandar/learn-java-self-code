package Oops.xyzstatic;

public class Staticblock {
    static{
        System.out.println("block 1");
    }
    static{
        System.out.println("block2");
    }
    public static void main(String[]args){
        System.out.println("aryba");
    }
    static{
        System.out.println("block 3");
    }
    
}
