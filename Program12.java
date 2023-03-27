import java.util.Scanner;
class Program12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String sn=sc.next();//sc.nextLine();
System.out.println("\nHappy Birthday" +sn);
System.out.print("\nEnter two numbers:");
int num1=sc.nextInt();//5
int num2=sc.nextInt();//7
//5*7=35
System.out.println("\n"+num1+"*"+num2+"="+num1*num2);
//5+7=12
System.out.println("\n"+num1+"+"+num2+"="+num1+num2);
//5-7=2
System.out.print("\n"+num1+"-"+num2+"-"+num1-num2);

}//main()
}//Program12