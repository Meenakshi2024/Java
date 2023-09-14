class CPU
{
double price;
public double price()
{
price=56655.356;
return price;
}
class Processor
{
double cores;
String manufacture;
public double cores()
{
cores=4;
return cores;
}
}
class RAM
{
double memory;
String manufacuter;
public double memory()
{
memory=128.14;
return memory;
}
}
}
public class Main {
public static void main(String[] args)
{
CPU cpu = new CPU();
CPU.Processor processor = cpu.new Processor();
CPU.RAM ram = cpu.new RAM();
System.out.println("Cpu Price = " + cpu.price());
System.out.println("Processor Cores = " + processor.cores());
System.out.println("Ram Memory = " + ram.memory());
}
}

