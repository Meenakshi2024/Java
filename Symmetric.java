import java.util.Scanner;
class Symmetric
{
public static void main(String args[])
{
int i,j=0,m,n;
Scanner sc=new Scanner(System.in);
int a[][]=new int[5][5];
int b[][]=new int[5][5];
int c[][]=new int[5][5];
System.out.println("Enter the no of rows:");
n=sc.nextInt();
System.out.println("Enter the no of columns:");
m=sc.nextInt();
System.out.println("Enter the elements:");
{
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}
}
if(n!=m)
{
System.out.println("Matrix is not square matrix, so it is not symmetric.");
}
else
{
boolean symmetric = true;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(a[i][j]!=a[j][i])
{
symmetric = false;
break;
}
}
}
if(symmetric)
{
System.out.println("Matrix is symmetric.");
}
else
{
System.out.println("Matrix is not symmetric.");
}
//a.close();
}
}
}
