import java.io.*;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;
class kthSmallest
{
    static int kthSmallest(int arr[], int k) 
    { 
        Arrays.sort(arr); 
        return arr[k-1]; 
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
	    System.out.println(kthSmallest(arr,k));
	  }
}
