package ObjectArray;

import java.util.Scanner;

public class Bank {
	Scanner sc=new Scanner(System.in);
	String AcHolderName,DOB;
	int AcNo;
	double Balance, Amount;
	public String getAcHolderName() {
		return AcHolderName;
	}
	public void setAcHolderName(String acHolderName) {
		AcHolderName = acHolderName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public int getAcNo() {
		return AcNo;
	}
	public void setAcNo(int acNo) {
		AcNo = acNo;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}

	void deposit()
	{
		System.out.println();
		System.out.print("Enter Amount:");
		Amount = sc.nextInt();
		Balance = Balance+Amount;
		System.out.println("Success! Amount deposited. Balance Available:"+Balance);
	}
	void withdraw()
	{
		System.out.println();
		System.out.print("Enter Amount:");
		Amount = sc.nextInt();
		if(Amount>Balance)
		{
			System.out.println("Insufficient Funds!!");
		}
		else
		{
			Balance = Balance-Amount;
			System.out.println("Amount Withdrawn! Available Balance:"+Balance);
		}
	}
	public Bank(String acHolderName, String dOB, int acNo, double balance) {
		super();
		AcHolderName = acHolderName;
		DOB = dOB;
		AcNo = acNo;
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [AcHolderName=" + AcHolderName + ", DOB=" + DOB + ", AcNo=" + AcNo + ", Balance=" + Balance
				+ "]";
	}


}

