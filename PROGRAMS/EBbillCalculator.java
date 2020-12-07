import java.util.*;
class EBbillCalculator
{
public static void main (String args[])
{
Customerdata ob = new Customerdata(); ob.getdata();
ob.calc();
ob.display();
}
}
class Customerdata
{
Scanner in = new Scanner(System.in);
Scanner ins = new Scanner(System.in); String cname,type;
int bn;
double current,previous,tbill,units; void getdata()
{
System.out.print ("\nEnter consumer number "); bn = in.nextInt();
System.out.print ("\nEnter Type of connection (D for Domestic or C for Commercial) ");
type = ins.nextLine();
System.out.print ("\nEnter consumer name "); cname = ins.nextLine();
System.out.print ("\nEnter previous month reading ");
previous= in.nextDouble();
System.out.print ("\nEnter current month reading "); current= in.nextDouble();
}
void calc()
{
units=current-previous; if(type.equals("D"))
{
if (units<=100) tbill=1 * units;
else if (units>100 && units<=200) tbill=2.50*units;
else if(units>200 && units<=500) tbill= 4*units;
else
tbill= 6*units;
}
else
{
if (units<=100) tbill= 2 * units;
else if(units>100 && units<=200) tbill=4.50*units;
else if(units>200 && units<=500) tbill= 6*units;
else
tbill= 7*units;
}
}
void display()
{
System.out.println("\nConsumer number = "+bn); 
System.out.println ("\nConsumer name = "+cname); 
if(type.equals("D"))
System.out.println ("\nType of connection = DOMESTIC ");
else
System.out.println ("\nType of connection = COMMERCIAL ");
System.out.println ("\nCurrent Month Reading = "+current);
System.out.println ("\nPrevious Month Reading = "+previous); 
System.out.println ("\nTotal units = "+units);
System.out.println ("\n Total bill = RS "+tbill);
}
}


