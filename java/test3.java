class Bank{
int getRateofinterest()
{
return 0;
}
}
class SBI extends Bank{
int getRateofinterest()
{return 8;}
}
class ICICI extends Bank{
int getRateofinterest()
{return 7;}
}
class AXIS extends Bank{
int getRateofinterest()
{return 9;}
}
class Test3{
public static void main (String args[]){
Bank b1 = new SBI();
Bank b2 = new ICICI();
Bank b3 = new AXIS();
System.out.println("SBI Rate of Interest:"+b1.getRateofinterest());
System.out.println("ICICI Rate of Interest:"+b2.getRateofinterest());
System.out.println("AXIS Rate of Interest:"+b3.getRateofinterest());
}
}