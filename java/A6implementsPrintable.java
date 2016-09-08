/*EXAMPLE OF INTERFACE*/
interface Printable{
void print();
class A6ImplementsPrintable{
public void print()
{
System.out.println("HELLO");
}
public static void main(String args[])
{
A6 obj=new A6();
obj.print();
}
}
}