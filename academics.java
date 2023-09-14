import java.util.*;
class academics{
public static void main(String args[])
{
result re=new result();
re.display();
re.display1();
re.display2();

}}

class student
{
Scanner sc=new Scanner(System.in);
String name;
int rollno, ac_score;
void display(){
System.out.println("Enter the name, rollno and academic score:");

name=sc.nextLine();
rollno=sc.nextInt();
ac_score=sc.nextInt();
}}

class sports extends student{
Scanner sc=new Scanner(System.in);
String item;
int sp_score;
void display1(){

System.out.println("Enter the sport name and score:");

item=sc.nextLine();
sp_score=sc.nextInt();
}}

class result extends sports{
void display2(){

System.out.println("..........Score Card...........");
System.out.println("Name of Student:" +name);
System.out.println("Roll no:" +rollno);
System.out.println("Academic Score:" +ac_score);
System.out.println("Sport Name:" +item);
System.out.println("Sports Score:" +sp_score);
}}

