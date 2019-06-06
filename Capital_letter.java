import java.util.Scanner;
import java.io.*;
class Capital_letter 
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
		System.out.println(cap);
	}
}
