package Strings;

public class stringsIntro {
    public static void main(String[]args){
// String name="taklu";
// String name1="taklu";
// String anotherName= new String ("anuj");
// System.out.println(name);//here the above code is said to be initialisation by literal("")
// System.out.println(name==anotherName);//output is false beacuse one is in (taklu) string pool area and another is in(anuj) both String pool area and heap area.

// System.out.println(name==name1);//output is true because both are store in string pool area.

//next concept
//here comes immutable(jo change nhi kia ja sakta hai)datatype in string
// String name="taklu";
// name="bakri";
// System.out.println(name);


//next concept(Function in Strings)
//first comes = char charAt(int index)
// String name="Anuj ";
// System.out.println(name.charAt(0));//output is A because it return the position of the string. here also zero base indexing is there.
// System.out.println(name.charAt(4));//String out of bound

//next function comes int length():calculate the length of the character
// System.out.println(name.length());


//next function is substring(continuos part of the string is sub string)
//1st function in substring (int beginIndex)
//2nd function in substring (int beginIndex,int endIndex)
//System.out.println(name.substring(2));// it gives the value from the given index to the last word of the string.
//System.out.println(name.substring(1,3));//here begin index word will print till end index which is given means is 3 is given as end index then till 2nd index word will be printed . 
 
//next function is Boolean contains(CharSequence s) 
//System.out.println(name.contains("Aman"));//will returns false as output because aman is not present in string(Anuj )


  
// next function in string boolean equals(object another ) 
// String name2=new String("Anuj ");
 //System.out.println(name==name2);//false
 //System.out.println(name.equals(name2));//true because it check the values Doesnot check object refernce



 //next function in string is boolean is empty()
 //check whether string is empty or if yes then it will give true value if no the it wil give false value
 //System.out.println(name2.isEmpty());


 
 //next function of string is String concat(String str) it is use to add like anuj bakri+ kumar
//  name=name+" bAkri";
//  System.out.println(name.concat(" kumar"));



 //next function is replace (char old, char new) replace the old character to new character we will get new strings
// System.out.println(name.replace('A','c'));//output is cnuj bckri



 //next function is String[]split(String regex )regex means regular expression
 //String cars="Hyundai,maruti,swift,mercedes,ford,ferrari";
 //String allCars[]=cars.split(",");
//  for(String car:allCars){
//      System.out.println(car);
//  }


 //int indexOf(int ch) inform the position of the character
 //System.out.println(cars.indexOf('M'));//output -1
 //System.out.println(cars.indexOf('m'));//output 8



 //String to lowerCase()
 //convert the upper case to lower case as a new strings.
 //System.out.println(cars.toLowerCase());


//String to upperCase()
 //convert the lower case to upper case as a new strings.
 //System.out.println(cars.toUpperCase());c




 //String trim()//removes spaces
//  String name="   anuj   ";
//  System.out.println(name.trim());


 







    }

    
}
