package assignments;

public class Assignment11_DiamondPatternArraysAndLoops {

	public static void main(String[] args) {
		
		int max=5;
		
		//Upper part of diamond
		
		for(int i=1;i<=max;i++)
		{
			for (int gap1=1;gap1<=max-i;gap1++)
			{
				System.out.print(" ");
			}
			for (int num1=1;num1<=i;num1++)
			{
			System.out.print(num1+" ");
			}
			System.out.println();
		}
		
		//lower part of diamond
		
		for(int j=max-1;j>=1;j--)
		{
			for(int gap2=1;gap2<=max-j;gap2++)
			{
			System.out.print(" ");
			}
			for (int num2=1;num2<=j;num2++)
			{
			System.out.print(num2+" ");
			}
		System.out.println();	
		}

	}

}
