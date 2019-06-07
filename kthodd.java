import java.io.*;
import java.util.Scanner;
class KthOdd 
{
    static int kthOdd(int arr[], int n, int k) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            if (arr[i] % 2 == 1) 
                k--; 
            if (k == 0) 
                return arr[i]; 
        } 
        return -1; 
    } 
	public static void main (String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<+n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.println(kthOdd(arr, n, k));
	}
}
