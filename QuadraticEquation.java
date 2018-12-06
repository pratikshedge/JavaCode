package Practise;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String args[])
	{
		int a,b,c;
		double root1,root2,d;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a");
	    a=sc.nextInt();
	    System.out.println("Enter b");
	    b=sc.nextInt();
	    System.out.println("Enter c");
	    c=sc.nextInt();
	    System.out.println("The quadratic equation is:"+" "+a+"x^2"+"+"+b+"x"+"+"+c);
	    d=b*b-4*a*c;
	    if(d>0)
	    {
	    	System.out.println("roots are real and unequal");
	    	root1=(-b+Math.sqrt(d))/2*a;
	    	root2=(-b-Math.sqrt(d))/2*a;
	    	System.out.println(root1);
	    	System.out.println(root2);
	    }
	    else if(d==0)
	    {
	    	System.out.println("roots are real and equal");
	    	root1=(-b+Math.sqrt(d))/2*a;
	    	System.out.println(root1);
	    }
	    else
	    {

	    	System.out.println("roots are imaganary");
	    }
	}

}
