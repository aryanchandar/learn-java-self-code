package Oops.xyzstatic;
    class Employee{
        int empid;
        String name;
         // String company;
         static String company="sp";
        Employee(int empid,String name){
            this.empid=empid;
            this.name=name;
            //this.company=company;
        }
        void display()
        {
            System.out.println(empid+" "+name+" "+company);
        }
        public  static void main(String[]args)
        {
            // Employee e1= new Employee(101,"amit","sp");
            // e1.display();
            // Employee e2=new Employee(1012,"asdamit","sp");
            // e2.display();
            Employee e1= new Employee(101,"amit");
            e1.display();
            Employee e2=new Employee(1012,"asdamit");
            e2.display();

            //sp hr baar likhna hotalekin static keyword k help se ek hii baar likhna hoga
            
        }
}

