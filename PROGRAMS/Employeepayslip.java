import java.util.*;
class Employeepayslip
{
  int empid;
  long mobile;
  String name, address, mailid;
  Scanner get = new Scanner(System.in);
  void getdata()
  {
    System.out.println("Enter Name of the Employee:");
    name = get.nextLine();
    System.out.println("Enter Mail id:");
    mailid = get.nextLine();
    System.out.println("Enter Address of the Employee:");
    address = get.nextLine();
    System.out.println("Enter employee id:");
    empid = get.nextInt();
    System.out.println("Enter Mobile Number:");
    mobile = get.nextLong();
  }
  void display()
  {
    System.out.println("Employee Name: "+name);
    System.out.println("Employee id : "+empid);
    System.out.println("Mail id : "+mailid);
    System.out.println("Address: "+address);
    System.out.println("Mobile Number: "+mobile);
  }
public static void main(String args[])
{
    int choice,cont;
    do
    {
        System.out.println("PAYROLL");
        System.out.println(" 1.PROGRAMMER \n 2.ASSISTANT PROFESSOR \n 3.ASSOCIATE PROFESSOR \n 4.PROFESSOR ");
        System.out.print("Enter choice:");
        Scanner c = new Scanner(System.in);			
        choice=c.nextInt();
        switch(choice)
        {
            case 1:
            {
                programmer p=new programmer();	
                p.getdata();
                p.getprogrammer();
                p.display();
                p.calculateprog();
                break;	
            }
            case 2:
            {
                asstprofessor asst=new asstprofessor();	
                asst.getdata();
                asst.getasst();
                asst.display();
                asst.calculateasst();
                break;
            }
            case 3:
            {
                associateprofessor asso=new associateprofessor();	
                asso.getdata();
                asso.getassociate();
                asso.display();
                asso.calculateassociate();
                break;
            }
            case 4:
            {
                professor prof=new professor();	
                prof.getdata();
                prof.getprofessor();
                prof.display();
                prof.calculateprofessor();
                break;
            }       
        }
    System.out.println("To continue 0 to quit and  1 ");
    cont=c.nextInt();
    }while(cont==1);		
}
}
class programmer extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getprogrammer()
    {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }
    void calculateprog()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println(".....................................");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("PF:Rs"+pf);
        System.out.println("HRA:Rs"+hra);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}	
class asstprofessor extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getasst()
    {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }
    void calculateasst()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("...........................................");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("HRA:Rs"+hra);	
        System.out.println("PF:Rs"+pf);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}
class associateprofessor extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getassociate()
    {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }
    void calculateassociate()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println(".................................");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("HRA:Rs"+hra);
        System.out.println("PF:Rs"+pf);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}
class professor extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getprofessor()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateprofessor()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR PROFESSOR");
        System.out.println("......................................");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("HRA:Rs"+hra);
        System.out.println("PF:Rs"+pf);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}
