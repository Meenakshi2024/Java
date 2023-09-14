import java.util.*; 
class publisher  {
public static void main(String args[]){
fiction fc=new fiction();
fc.details();
fc.details1();
fc.details2();

}}


class book{
Scanner sc=new Scanner(System.in);
String bookname;
int price;
void details(){
System.out.println("enter book name and price");
bookname=sc.nextLine();
price=sc.nextInt();

}}


class liter extends book{
Scanner sc=new Scanner(System.in);
String ln;
void details1(){
System.out.println("enter literature type");
ln=sc.nextLine();

}}


class fiction extends liter{
Scanner sc=new Scanner(System.in);
void details2(){
System.out.println("enter name of the author and publisher");
String auth=sc.nextLine();
String pub=sc.nextLine();
System.out.println("............About Book.............");
System.out.println("...................................");
System.out.println("book name=" +bookname);
System.out.println("price=" +price);
System.out.println("Literature type=" +ln);
System.out.println("Author=" +auth);
System.out.println("Publisher=" +pub);
}} 
