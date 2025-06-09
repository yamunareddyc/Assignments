package assignments;

public class Assignment13_PrimeNumber {
	public static void main(String[] args) {
		int num=23;
		if(num<=1)
		{
			System.out.printf("The number you entered "+num+"  is NOT a prime number");
		}
		else if(num==2||num==3)
		{
			System.out.printf("The number you entered "+num+" is a PRIME NUMBER");
		}
		else
		{
			for (int n=2;n<num;n++)
			{
				int div=num%n;
				if(div==0)
				{
					System.out.printf("The number you entered "+num+"  is NOT a prime number");
					break;
				}
				if(n==num-1)
				{
					System.out.printf("The number you entered "+num+" is a PRIME NUMBER");
					break;
				}
			}
		}
	}

}
