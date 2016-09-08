class Bank{
int getRate of interest(){return 0;}
}
class SBI extends Bank{
int getRate of interest(){return 8;}
}
class ICICI extends Bank{
int getRate of interest(){return 7;}
}
class AXIS extends Bank{
int getRate of interest(){return 9;}
}
class Test 3{
public static void main (String args[]){
Bank b1 = new SBI();
Bank b2 = new ICICI();
Bank b3 = new AXIS();
System.out.println("SBI Rate of Interest:"+b1.getRate of interest());
System.out.println("ICICI Rate of Interest:"+b2.getRate of interest());
System.out.println("AXIS Rate of Interest:"+b3.getRate of interest());
}
}