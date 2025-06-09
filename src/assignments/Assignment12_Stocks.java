package assignments;

public class Assignment12_Stocks {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		int profit1=0;
		int maxProfit=0;
		
		
		for(int i=0;i<prices.length;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				if(prices[i]<prices[j])
				{
					profit1=prices[j]-prices[i];
					if(maxProfit<profit1)
					{
						maxProfit=profit1;
					}
				}	
		}
	}
		System.out.println("Max Profit possible is "+maxProfit);
 }
}
