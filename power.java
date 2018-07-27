/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int base,exponent;
		int result=1;
		base=sc.nextInt();
		exponent=sc.nextInt();
		while(exponent!=0);
		{
			result=result*base;
			--exponent;
		}
		System.out.println(result);
		
		}
	
}
