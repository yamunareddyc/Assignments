package assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//float
		float weather = 25.2f;
		System.out.printf("Temperature of a city in degrees Celsius:%.1f \n",weather);
		
//boolean
		boolean order = true;
		boolean noOrder=false;
		System.out.println("Whether a customer has placed an order:"+order+"or"+noOrder);

//string
	
 		String Phno = "123-456-7890";
 		System.out.printf("Person's phone number: \"%s\"\n",Phno);
 
//float
		float bal = 1000.50f;
		System.out.printf("Amount of money in a customer's bank account:%.2f \n",bal);
		
//string
		
		 String email = "john.doe@example.com";
		 System.out.printf("Person's email address: \"%s\"\n",email);
		 
//double
		 double lat = 37.7740;
		 double log = -122.4194;
		 
		 System.out.format("Coordinates of a location (latitude, longitude):%.4f,%.4f\n",lat,log);
		 
//boolean
		 boolean t = true;
		 boolean f = false;
		 
		 System.out.printf("Person's marital status:%b or %b\n",t,f);
		 
		 
//string
		 
		 String prof = "Software Engineer";
		 System.out.print("Person's occupation:\""+prof+"\"\n");
		 
//String
		 
		 String favColor="Blue";
		 System.out.printf("Person's favourite colour:\"%s\"\n",favColor);
		 
//int
		 
		 int yr = 2023;
		 System.out.println("Current year:"+yr);
		 
//long
		 
		 long fol = 1000000;
		 System.out.format("Number of followers on a social media platform:%,d\n",fol);
		 
//float
		 
		 float movRat = 7.5f;
		 System.out.printf("Rating of a movie:%.1f \n",movRat);
		 
//character
		 
		 char alpha = 'A';
		 System.out.printf("Person's blood type:\'%c\'\n",alpha);
		 
//string
		String movName = "To Kill a Mockingbird";
		System.out.printf("Title of a book:\"%s\"\n",movName);
		
		//int
		int empCount=500;
		System.out.printf("Number of employees in a company:%d\n",empCount);
		
		//string
		String tme="2:30 PM";
		System.out.printf("Time of an event:%s\n",tme);
		
		//string
		String cntry = "United States";
		System.out.printf("Name of a county:\"%s\"\n",cntry);
		
		//string
		String eyeColor="Brown";
		System.out.printf("Person's eye color:\"%s\"\n",eyeColor);
		
		//string
		String birthPlace="New York City";
		System.out.printf("Person's birthplace:\"%s\"\n",birthPlace);
		
		//float
		float dist = 200.5f;
		System.out.printf("Distance between two cities:%.1f\n",dist);
}
}
