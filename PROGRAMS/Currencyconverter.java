import java.util.*;
public class Currencyconverter
{
    double inr,usd;
    double euro,yen;
    Scanner in=new Scanner(System.in);
public void dollartorupee()
{
    System.out.print("Enter dollars:");
    usd=in.nextInt();
    inr=usd*67;
    System.out.println(usd+" dollar = "+inr+" rupee");
}
public void rupeetodollar()
{
    System.out.print("Enter Rupee :");
    inr=in.nextInt();
    usd=inr/67;
    System.out.print(inr+" INR="+usd+" dollars");
}
public void eurotorupee()
{
    System.out.print("Enter euro :");
    euro=in.nextInt();
    inr=euro*79.50;
    System.out.println(euro+" euro="+inr+" rupee");
}
public void rupeetoeuro()
{
    System.out.print("Enter Rupees :");
    inr=in.nextInt();
    euro=(inr/79.50);
    System.out.println(inr+" rupee="+euro+" Euro");
}
public void yentorupee()
{
    System.out.print("Enter yen :");
    yen=in.nextInt();
    inr=yen*0.61;
    System.out.println(yen +" yen= "+inr+" rupee");
}
public void rupeetoyen()
{
    System.out.print("Enter Rupees :");
    inr=in.nextInt();
    yen=(inr/0.61);
    System.out.println(inr +" rupee="+yen+" yen");
}
}
