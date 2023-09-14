package Arithmetic;
interface interface1{
void calculate(float a, float b);
}
public class Division implements interface1{
public void calculate(float a, float b){
System.out.println("Quotient of the given numbers is:" +(a/b));
}
public static void main(String args[]){}
}
