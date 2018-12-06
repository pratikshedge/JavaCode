package ObjectArray;

import java.util.Scanner;

public class BankPojo {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Bank b[]=new Bank[10]; // Object Array
		String AcHolderName,DOB;             
		int i,AcNo,flag,count=0,choice=0;		  
        double Balance;
		do
		{
            flag=1;  //reset flag
			System.out.println("1.Add Account");
			System.out.println("2.Update Existing Account");
			System.out.println("3.Deleting Existing Account");
			System.out.println("4.Searching Particular Account");
			System.out.println("5.Displaying All Accounts");
			System.out.println("6.Depositing Money in Particular account");
			System.out.println("7.Withdrawing money from particular account");
			System.out.println("8.Exit");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:

				System.out.println("Enter a AcHolderName ");
				AcHolderName=sc.next();
				System.out.println("Enter a DOB");
				DOB=sc.next();
				System.out.println("Enter a AcNo");
				AcNo=sc.nextInt();
				System.out.println("Enter a Balance");
				Balance=sc.nextDouble();
				b[count]=new Bank(AcHolderName,DOB,AcNo,Balance);
				count++;
				break;
			case 2:

				System.out.println("Enter the AcHolderName");
				AcHolderName=sc.next();
				for(i=0;i<count;i++)
				{
					if(b[i]==null && b[i].getAcHolderName()==AcHolderName);
					{
						System.out.println("Enter the DOB");
						DOB=sc.next();
						b[i].setDOB(DOB);

						System.out.println("Enter the AcNo");
						AcNo=sc.nextInt();
						b[i].setAcNo(AcNo);

						System.out.println("Enter the Balance");
						Balance=sc.nextInt();
						b[i].setBalance(Balance);

						

					}
				}
				System.out.println("Update Successfully!");
				break;
			case 3:
				System.out.println("Enter the AcHolderName");
				AcHolderName=sc.next();
				for(i=0;i<count;i++)
				{
					if(b[i]==null && b[i].getAcHolderName()==AcHolderName);
					{
						b[i]=null;
					}
				}
				System.out.println("Deleted Successfully");
				break;

			case 4:
				System.out.println("Enter the AcHolderName");
				AcHolderName=sc.next();
				for(i=0;i<count;i++)
				{
					if(b[i]==null && b[i].getAcHolderName()==AcHolderName);
					{	
						System.out.println(b[i]); 
					}
				}
				System.out.println("Account Search Successfully");
				break;

			case 5:
				for(i=0;i<count;i++)
				{
					if(b[i]!=null)
					{
						System.out.println(b[i]);
						System.out.println(b[i].toString());
					}
				}

				System.out.println("List of Books");
				break;
			case 6:
				System.out.println("Enter Account Number:"); 
				AcNo = sc.nextInt();
				for(i=0;i<count;i++) 
				{ 
					if(AcNo ==b[i].AcNo) 
					{ 
						b[i].deposit(); 
						flag=0; 
					}
				} 
				if(flag==1)
				{ System.out.println("Account number not found!!"+"\n"); 
				}	
				break;
			case 7:
				System.out.println("Enter Account Number:"); 
				AcNo = sc.nextInt();
				for(i=0;i<count;i++)
				{ 
					if(AcNo == b[i].AcNo) 
					{ 
						b[i].withdraw(); 
						flag=0; 
					} 
				} 
				if(flag==1)
				{ 
					System.out.println("Account number not found!!"+"\n"); 
				}  
				break;
			case 8:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter Valid choice");
				break;
			}
			sc.close();
		}while(choice<=8);
	}
}

