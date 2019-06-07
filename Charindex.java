import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Charindex
{
    public static void main(String args[])
    {
	    Scanner sc=new Scanner(System.in);
	    String n= sc.nextLine();
	    int even=0, odd=0, a=n.length();
	    char strE[]=new char[a];
	    char strO[]=new char[a];
        for(int i=0;i<a;i++)
        {
            if(i % 2 == 0)
            {
                strE[even] = n.charAt(i);
                even++;
            }
            if(i % 2 == 1)
            {
                strO[odd] = n.charAt(i);
                odd++;
            }
        }
        System.out.print(strE);
        System.out.println(strO);
    }
}
