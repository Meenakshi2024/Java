import java.util.Scanner;
class matrc
{
public static void main(String args[])
{
int i,j=0,m,n;
Scanner sc=new Scanner(System.in);
int a[][]=new int[5][5];
int b[][]=new int[5][5];
int c[][]=new int[5][5];
System.out.println("Enter first limit:");
n=sc.nextInt();
System.out.println("Enter second limit:");
m=sc.nextInt();
System.out.println("First matrix");
{
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}
}
System.out.println("Second matrix");
{
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=sc.nextInt(); 
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]);
}
}
}
}
