package Oops;

class Casio{
    int num1;
    int num2;
    String operation;  

    public Casio(){
       num1 =0;
       num2=0;
      operation ="nothing";
        
}
public Casio(int i){
    num1=i;
    num2=0;
    operation="nothing";
}
public Casio(int i,int j){
    num1=i;
    num2=j;
    operation="nothing";
}
public Casio(int i,int j,String op){
    num1=i;
    num2=j;
operation="op";
}
public static void main(String[]args){
Casio Casio1= new Casio(3,4,"add");
System.out.println(Casio1);
}
}