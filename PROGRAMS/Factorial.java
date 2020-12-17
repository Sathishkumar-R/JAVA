import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		int n,i=1,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number to find factorial :");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
			f=f*i;
		System.out.println("Factorial of the number is:"+f);
	}
}
