package assignments;

public class Assignment7_ConditionalStatements {
	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditScore=720;
		float income=55000.0f;
		boolean isEmployed=true;
		float debtToIncomeRatio = 35.0f;	
		
		if(creditScore>750)
		{
			System.out.println("Congratulations"+customerName+"! Your loan is approved");
		}
		else if (creditScore<=750 && creditScore>=650)
		{
			if (income>=55000.0)
			{
				if (isEmployed==true)
				{
					if (debtToIncomeRatio<40.0)
						System.out.println("Congratulations"+customerName+"! Your loan is approved.");
					else 
						System.out.println("Sorry! Your loan is denied. Your debtToIncome ratio is high.");
				}
				else
					System.out.println("Sorry! Your loan is denied. You are not employed.");
			}
			  else 
				  System.out.println("Sorry! Your loan is denied. You income is less than 55000");
			}
		else
		{
			System.out.println("Sorry! Your loan is denied. You have very low credit score");
		}
		}
	}