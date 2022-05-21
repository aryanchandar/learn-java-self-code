package arrays;

public class Bubblesort {
    public static void main(String[]args) {
        int a[]={2,1,8,-3,6,4,12};
        int n=a.length;//we will store the value of the length of array in n by the the help of this we will run the for loop for itration till n-1 times.
        // for(int i=0;i<n; i++)here also for optimisation(run outer loop lesser time)kyunki haar baar aisa nhi hota h kii n-1 itration chalega tb hii  sort hoga kabbhi kabhi jaldi hojata hai.phle hii sort hojata h uske liye check laga dete hai h uske liye aapn boolean lga dete hai agr array jaldi sort hogya h toh aapn boolean k help se usko rok sakte hai loop m jaane k liye
        for(int i=0;i<n; i++){
            //boolean sorted=true;
            //for(int j=0;j<n-1-i;j++)//(run inner loop lesser time)here we can see that j<n-1-i we run the inner loop n-1-i times beacuse of optimisation of the program or fast responding by these  we doesn't check all the element of each itration it depend on i. Jo sorted part h usko aapn baar baar check hi kr rhe hai
            for(int j=0;j<n-1;j++){
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    //sorted=false;//agr ek swap kr rha hai toh false hoga aur itration will be continues
                } 
            }
            //if(sorted)break;//agr  sort hogya mera array toh break execute hoga aur aapne aap bahr aajyega loop se yeah sb boolean lagana wagera wagera sb optimisation k liye hai.
        }//refer all the detail in  notes(copy)
        for(int item:a){
            System.out.print(item+"  ");
        }

    }

    
}
