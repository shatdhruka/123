import java.util.Scanner;
import java.io.*;
import java.lang.Math;

class Product&Perfectsquare 
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int a=n*m;
	    int b=(int)Math.sqrt(a);
	    if((b*b)==a)
		    System.out.println("yes");
		else
		    System.out.println("no");
	}
}
