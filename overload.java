import java.util.*;
class shapes
{
void area(float x)
{
System.out.println("Area of Square is: "+x*x+"");
}
void area(float x, float y)
{
System.out.println("Area of rectangle is: "+x*y+"");
}
void area(double x)
{
double z=3.14*x*x;
System.out.println("Area of Circle is: "+z+"");
}
}

class overload
{
public static void main(String args[])
{
float p,q,r;
double s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of square:");
p=sc.nextInt();
System.out.println("Enter the length and breadth of rectangle:");
q=sc.nextFloat();
r=sc.nextFloat();
System.out.println("Enter the radius of circle:");
s=sc.nextDouble();
shapes ob=new shapes();
ob.area(p);
ob.area(q,r);
ob.area(s);
}
}
