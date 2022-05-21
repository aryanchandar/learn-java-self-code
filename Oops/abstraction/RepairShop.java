package Oops.abstraction;

public class RepairShop {

    /*public static void repairCar(WagonR car)
    {
    System.out.println("car is repaired");
    }
    public static void repairCar(Audi car)
    {
        System.out.println("car is repaired");
        }*/


        public static void repairCar(Car car)
        {
        System.out.println("car is repaired");
        }    
      public static void main(String[] args) {

        //creating wagronR and audi object
        WagonR wagonR= new WagonR();
        Audi audi= new Audi();
          
      // Car car=new Car();//error aayega 
        repairCar(wagonR);
        repairCar(audi);
            
        }
    
}
