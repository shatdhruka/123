import java.util.Scanner;
import java.io.*;
class area_of_farm  
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    float l=sc.nextFloat();
	    float b=sc.nextFloat();
	    float c=l*b;
		System.out.printf("%.5f",c);
	}
}
