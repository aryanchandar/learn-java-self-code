package userInput;
import java.util.Scanner;
public class ScannerUserInput
{
  public static void main(String[]args)
  {  
  Scanner sc = new Scanner(System.in);
  //int x= sc.nextInt();
  //String hello =sc.nextLine();
  //System.out.println(hello);
  //next program hai
  //int principal=3600;
  //float rate=12.5f;
  //int time=12;
  //float simpleInterest= principal*rate*time/100;
  //System.out.println("the simple interest is"+ simpleInterest);
  int principal=sc.nextInt();
  float rate=sc.nextFloat();
  int time=sc.nextInt();
  float simpleInterest= principal*rate*time/100;
  System.out.println("the simple interest is"+ simpleInterest);
  }

}
