package assignments;

import java.util.HashSet;
import java.util.Set;

public class Assignment8_ConditionalStatementsAndLoops {
	public static void main(String[] args) {
		
		Set<Integer> transaction = new HashSet<>();
		
		transaction.add(50000);
		transaction.add(-2000);
		transaction.add(3000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(4000);
		transaction.add(-3000);
		
		System.out.println("Total number of credit/debit transactions is "+transaction.size());
		System.out.println();
		
		int cred=0;
		int deb=0;
		int bankBalance=0;
		int totsus=0;
		
		for(int tran:transaction) {
			
			bankBalance=bankBalance+tran;
			
			if(tran<-10000 || tran>10000)
			{
			System.out.println("Suspicious Credit/Debit Transaction with Amount "+tran);
			totsus++;
			}
			
			if(tran>0)
			{
				cred=cred+tran;
			}
			else
			{
				deb=deb+tran;
			}
		}
		
		System.out.println();
		System.out.println("Total amount credited to the account is "+cred);
		System.out.println();
		System.out.println("Total amount debited to the account is "+deb);
		
		System.out.println();
		System.out.println("Bank Balance at the end is "+bankBalance);
		System.out.println();
		
		System.out.println("Total number of suspicious Credit/Debit transactions is "+totsus);		
		
	}

}
