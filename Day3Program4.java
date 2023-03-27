import java.util.Scanner;
class Day3Program4
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();//16
  int num2=sc.nextInt();//11
  int max=0;
  if(num1>=num2)max=num1;
  if(num2>=num1)max=num2;
  System.out.print("Largest out of"+num1+"and"+num2+"is"+max);
}//main()
}//Day3Program4