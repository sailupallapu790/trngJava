import java.util.Scanner;
 class Prog1
{
 public static int countDigit(int n)
{
 int count=0;
 while(n>0){
      n=n/10;
     count++;
}
 return count;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number :");
n=sc.nextInt();
System.out.println("Number of the digit of the number " +n+ "is");
System.out.println(Prog1.countDigit(n));
}
}