import java.util.*;
import java.lang.*;
 class Circle
{
   public double calculateArea(double r)
{
   double area=Math.PI* Math.pow(r,2);
   return area;
}//calculateArea
}//Circle 

 class Day5Program4
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  double radius=sc.nextDouble();
  Circle ob=new Circle();
   System.out.println(ob.calculateArea(radius));
}//main()
}//Day5Program4