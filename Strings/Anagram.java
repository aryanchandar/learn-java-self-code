package Strings;
//here we see the anagram program with 2 ways ||1st is by checking every word of both the string one by one but in this method the time complexity is O(n^2) so next we will see the 2nd ways to optimise the program.......
public class Anagram {
     public static void main(String[] args) {
      String a="aab";
      String b="aba";
      //boolean isAnagram=false;//yeah check h (local variable hai baad m ....dekhte hai kya h yeah)
    //   boolean visited[]=new boolean[b.length()];//yeah line continues charactor  k liye declare kia gya h  agr ek charactor 2nd string milta hai ya match krna hai toh usko dusri baar(same character aane pr) consider nhi kia jayega {yeah check h visited name boolean array hai }aapn log character by character  jayenge agr phle se visit ho chuka hai toh aapn log usko mark kr denge
    //   if(a.length()==b.length())//phle yeah check hoga tb hii for loop wle code m ghusega nhi toh nhi
    //   {
    //   for(int i=0;i<a.length();i++ ){
    //       char c=a.charAt(i);//here we will pick up character from string 1 and check in string 2 so will use char c=a.charAt(i){yeah string function m padhe th }
    //       isAnagram=false;

    //       for(int j=0;j<b.length();j++){
    //           if(b.charAt(j)==c  && !visited[j])//b.charAt(j)==c it mean c ka value ek ek kr check horha h string 1 se
    //           //!visited[j] it mean kya yeah index position non visited hai isAnagram=true; tabhi yeah true hoga
    //           {
    //               visited[j]=true;  
    //               isAnagram=true;//yeah line ka matlb h  ek word agr mil gya same wla matlb starting m ya continues m toh tbtk yeah anagram h aur further checking hogaa......filhal k liye h bs
    //               break;
    //           }}
    //           if(!isAnagram){
    //               break;
    //           }
    //       }
    //     }




//here comes the second method for anagram of string by making 2 array of length 256
boolean isAnagram=true;

int al[]=new int[256];//array hai
int bl[]=new int[256];


for(char c: a.toCharArray())//use for loop
//toCharArray returns the character of an array and accessing the character one by one 
{
int index=(int)c;//type cast
al[index]++;//increment
}
for(char c: b.toCharArray())//use for else loop
//toCharArray returns the character of an array and
{
int index=(int)c;
bl[index]++;
}

for(int i=0;i<256;i++){
    if(al[i]!=bl[i]){
        isAnagram=false;
        break;
    }
}





           if(isAnagram){
               System.out.println("anagram");
           }else{
               System.out.println("not anagram");
           }
      }


        
    }

