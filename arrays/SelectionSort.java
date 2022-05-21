package arrays;

public class SelectionSort {
    public static void main(String[]agrs){
        int a[]={3,1,-2,7,4,0};
        int n=a.length;
        for(int i=0;i<n;i++){
            int minIndex=i; 
            for(int j=i;j<n;j++)//here j=i kyunki swap hone k baad jo element bacha hua hai ussi m se smallest element ko search kr rha h
            {
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
        for(int e:a){
            System.out.print(e+"  ");
        }
    }
    
}
