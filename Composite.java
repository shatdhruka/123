import java.util.Scanner;
class Composite
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count>2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
