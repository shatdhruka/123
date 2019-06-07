/*package whatever //do not write package name here */
import java.util.Scanner;
import java.io.*;

class NumberInString 
{
    public static String extractNumber(final String str) 
    {                
    if(str == null || str.isEmpty()) return "";
    StringBuilder sb = new StringBuilder();
    boolean found = false;
    for(char c : str.toCharArray())
    {
        if(Character.isDigit(c))
        {
            sb.append(c);
            found = true;
        } 
        else if(found)
        {
            break;                
        }
    }

    return sb.toString();
    }
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    
	    System.out.print(extractNumber(str));
	}
}
