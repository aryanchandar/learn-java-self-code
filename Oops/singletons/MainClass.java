package Oops.singletons;

public class MainClass {
    public static void main (String[]args){
        /*Appconfig obj=new Appconfig();
        Appconfig obj1=new Appconfig();//jitne baar object bnega utna baar memory m space occupy karega toh aapn chahte hai kii ek hii object bane aur aapn jante hai kii jb bhi object bnta hai toh constructor call hota hai(appconfig(); toh aapn appconfig constructor ko private kar denge aur private karne k baad aapn dekh rhe th kii aapn single object hii create kr sakte h*/

        Appconfig obj= Appconfig.getInstance();
        // Appconfig obj1= Appconfig.getInstance();
        // Appconfig obj2= Appconfig.getInstance();

  }
    
}
