import java.util.Scanner;
import Arithmetic.Addition;
import Arithmetic.Subtraction;
import Arithmetic.Multiplication;
import Arithmetic.Division;
public class Prgrm6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=1, ch;
System.out.println("Program to perform basic arithmetic operations");
System.out.println("Enter two numbers:");
float n1=sc.nextInt();
float n2=sc.nextInt();
while(i!=0){
System.out.println("1. Addition \t2. Subtraction \t3.Multiplication \t4.Division");
System.out.println("Enter your choice:");
ch=sc.nextInt();
switch(ch){
	case 1:Addition ob1=new Addition();
	       ob1.calculate(n1,n2);
	       break;

	case 2:Subtraction ob2=new Subtraction();
	       ob2.calculate(n1,n2);
	       break;

	 case 3:Multiplication ob3=new Multiplication();
                ob3.calculate(n1,n2);
                break;

	case 4:Division ob4=new Division();
               ob4.calculate(n1,n2);
               break;
}
System.out.println("Do you want to continue?(0(no),1(yes))");
i=sc.nextInt();
}
}
}
