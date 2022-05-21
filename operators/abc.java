package operators;

class dog{
    String breed,name,color;
    int legs,eyes;
    public void walk(){
        System.out.println("");
    }
    public void eat(){
        System.out.println("");


    }
    public void description(){
        System.out.println("my cat has "+legs+ "legs and "+ eyes +" eyes "+breed+" breed  "+name+" name  "+color+" color ");


    }
}

    public class abc{
        public static void main(String[]args){
            dog dog1=new dog();
            dog dog2=new dog();
            dog1.name="abc";
            dog1.eyes=2;
            dog1.breed="pomerian...";
            dog1.color="black ";
            dog1.legs=4;
            dog1.description();
        }
    
}