package Diwali;

public class HappyDiwali {
	public static void main(String args[])
	{   
		System.out.println();
		for(int i=1;i<=4;i++)
		{   System.out.print("                 "); 
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		{   
			for(int i=1;i<=4;i++)
			{   System.out.print("                 "); 
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=8;k>=2*i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		}
		{
			for(int i=1;i<=3;i++)
			{   System.out.print("             "); 
			for(int j=1;j<=i;j++)
			{  
				System.out.print(" ");
			}
			for(int k=7;k>=i;k--)
			{
				System.out.print(" *");
			}

			System.out.println();
			}
		}
		{ 
			for(int i=0;i<=11;i++)
			{    
				System.out.print("                           ");
				for(int j=0;j<2;j++)
				{   
					System.out.print("*");
				}
				for(int k=0;k<=5;k++)
				{
					if(i>4 && i<7)
						System.out.print("**");
					else
						System.out.print("  ");	   
				}
				for(int j=0;j<2;j++)
				{   
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.print("                                           APPY");
		}
		System.out.println();
		{    int i,j,k;
		for(i=0;i<=11;i++)
		{   System.out.print("                                            ");
		for(j=0;j<=2;j++)
		{   
			System.out.print("*");
		}
		for(k=0;k<=5;k++)
		{	if(i>=0 && i<2 || i>9 && i<=11 || k==5)
			System.out.print("**");
		else
			System.out.print("  ");
		}
		for(j=0;j<=2;j++)
		{   if(i>=0 && i<2 || i>9 && i<=11)
			System.out.print(" ");
		else
		{
		}
		}
		System.out.println();	
		}
		System.out.print("                                                           IWALI");
		System.out.print("                                                         #FROM_PRATIK_SHEDGE");
		}
	}
}




