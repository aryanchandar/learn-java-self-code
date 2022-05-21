package Oops.xyzstatic;

class counterdemo{
//     int count=0;
//     counterdemo(){
//         count++;
//         System.out.println(count);
//     }
//     public static void main(String[]args){
//         counterdemo c1=new counterdemo();
//         counterdemo c2=new counterdemo();
//         counterdemo c3=new counterdemo();
//output was 1,1,1

//     }
// }
static int count=0;
counterdemo(){
    count++;
    System.out.println(count);
}
public static void main(String[]args){
    counterdemo c1=new counterdemo();
    counterdemo c2=new counterdemo();
    counterdemo c3=new counterdemo();
    //output is 1,2,3

}
}