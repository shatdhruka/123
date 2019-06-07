import java.util.Scanner;
import java.io.*;

class asciivalue
{
    public static void main(String args[])
    {
	    Scanner sc=new Scanner(System.in);
	    char c = sc.next().charAt(0);
        int asciiCode = c;
        System.out.print(asciiCode);
    }
}
