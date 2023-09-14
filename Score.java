import java.util.Scanner;
class student
{
String name;
int roll_no;
float mark1, mark2;
{
String p;
int q;
float r,s;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the name:");
p=sc.nextLine();
System.out.println("Enter roll no:");
q=sc.nextInt();
System.out.println("Enter mark1:");
r=sc.nextFloat();
System.out.println("Enter mark2:");
s=sc.nextFloat();
}
void display()
{
System.out.println("Student Details");
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No. of Student: " + roll_no);
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
}
}

class sports extends student
{
String sports_name;
int score;
{
String l;
float m;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the Sports Name:");
l=sc.nextLine();
System.out.println("Enter score:");
m=sc.nextFloat();
}

void display() 
{
        System.out.println("Sports Details");
        System.out.println("Item :" + sports_name);
        System.out.println("Rank  :" + score);
}
}

class result extends sports
{
float total_score;

void display() 
{
        System.out.println("Total Score");
        total_score=mark1+mark2+score;
        System.out.println("Rank  :" + total_score);
}
}

class Score
{
public static void main(String args[])
{

student ob=new student();
sports oj=new sports();
result ol=new result();
}}
