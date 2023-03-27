import java.util.Scanner;
 class Prog
{
 public static int productDigit(int n)
{
 int temp=1;
 while(n>0){
      temp=temp*(n%10);
      n=n/10;
}
return temp;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number :");
n=sc.nextInt();
System.out.println("Product of the digit of the number " +n+ "is");
System.out.println(Prog.productDigit(n));
}
}