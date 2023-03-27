import java.util.Scanner;
class Day3Program7
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();//22
  int num2=sc.nextInt();//2
  int res=0;
  if(num2==0)System.out.println("INVALID");
 else
{
 res=num1/num2;
 //10/2=5
  System.out.println(num1+" / "+num2+" = "+res);
}//else
}//main()
}//Day3Program6