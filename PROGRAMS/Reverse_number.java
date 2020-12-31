import java.util.Scanner;
public class Reverse_number
{
	public static void main(String args[])
	{
		int n,rev=0,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to reverse :");
		n=sc.nextInt();
		sc.close();
		while(n!=0)
		{
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
	System.out.println("The reversed number :"+rev);
	}
}
