package Oops;

// class Test2 {
//     Test2(int a)
//     {
//         System.out.println("parametrized constructor");
//     }
//     public static void main(String[]args)
//     {
//         Test2 t=new Test2(23);
//     }}



class Employeee
{
    String name;
    int emp_id;

    Employeee(String name,int emp_id)
    {
        this.name=name;
        this.emp_id=emp_id;

    }
    public static void  main (String[]args){
Employeee e1=new Employeee("abac",101);
Employeee e2=new Employeee("hasds",102);
System.out.println("Employee 1 "+e1.name+" "+e1.emp_id);
System.out.println("Employee 2 "+e2.name+" "+e2.emp_id);




    }
}