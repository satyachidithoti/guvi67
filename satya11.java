 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,a=0;
		while(n !=0)
		{
		a=n%10;	
			count++;
			n=n/10;
		}
		System.out.println(count);
		}
	}
