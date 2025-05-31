package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_Collections {

	public static void main(String[] args) {
		
//student Lists
		
		List<String> student1 = new ArrayList<>();
		student1.add("John Doe");
		student1.add("Twenty");
		student1.add("Male");
		student1.add("A++");
		student1.add("Computer Science");
		student1.add("A 3.8");
		student1.add("john@example.com");
		student1.add("SDF6543210");
		student1.add("123 Elm St");
		
		List<String> student2 = new ArrayList<>();
		student2.add("Jane Smith");
		student2.add("Twenty One");
		student2.add("Female");
		student2.add("B+");
		student2.add("Mathematics");
		student2.add("A 3.5");
		student2.add("jane@example.com");
		student2.add("REW6543211");
		student2.add("456 Oak St");
		
		List<String> student3 = new ArrayList<>();
		student3.add("Mike Brown");
		student3.add("Twenty Two");
		student3.add("Male");
		student3.add("A+");
		student3.add("Physics");
		student3.add("A 3.9");
		student3.add("mike@example.com");
		student3.add("TYR6543212");
		student3.add("789 Pine St");
		
//Employee Lists
		
		List<String> employee1 = new ArrayList<>();
		employee1.add("Alice Green");
		employee1.add("Thirty");
		employee1.add("Female");
		employee1.add("Engineering");
		employee1.add("Software Engineer");
		employee1.add("75K Pounds");
		employee1.add("alice@example.com");
		employee1.add("SDF6543210");
		
		List<String> employee2 = new ArrayList<>();
		employee2.add("Bob Johnson");
		employee2.add("Thirty Five");
		employee2.add("Male");
		employee2.add("Marketing");
		employee2.add("Marketing Manager");
		employee2.add("85K Pounds");
		employee2.add("bob@example.com");
		employee2.add("REW6543211");
		
		List<String> employee3 = new ArrayList<>();
		employee3.add("Carol White");
		employee3.add("Twenty Eight");
		employee3.add("Female");
		employee3.add("Sales");
		employee3.add("Sales Executive");
		employee3.add("65K Pounds");
		employee3.add("carol@example.com");
		employee3.add("TYR6543212");
		
//Product Lists
		
		List<String> product1 = new ArrayList<>();
		product1.add("Laptop");
		product1.add("Electronics");
		product1.add("12K Pounds");
		product1.add("");
		product1.add("Tech Supplies");
		product1.add("2 years");
		product1.add("4.5 Stars");
		product1.add("Aug 2023");
		product1.add("Aug 2028");
		
		List<String> product2 = new ArrayList<>();
		product2.add("Desk Chair");
		product2.add("Furniture");
		product2.add("150K Pounds");
		product2.add("Two");
		product2.add("Office Depot");
		product2.add("1 year");
		product2.add("4 Stars");
		product2.add("Sep 2024");
		product2.add("N/A");
		
		List<String> product3 = new ArrayList<>();
		product3.add("Coffee Maker");
		product3.add("Kitchen");
		product3.add("75 Pounds");
		product3.add("Two Hundred");
		product3.add("Kitchen World");
		product3.add("6 months");
		product3.add("4.2 Stars");
		product3.add("Jan 2025");
		product3.add("Jan 2027");
		
		
//Map of all lists
		
		Map<String,List> allData = new HashMap<>();
		allData.put("SBA12345",student1);
		allData.put("SBA12346",student2);
		allData.put("SBA12347",student3);
		allData.put("E001",employee1);
		allData.put("E002",employee2);
		allData.put("E003",employee3);
		allData.put("P001",product1);
		allData.put("P002",product2);
		allData.put("P003",product3);
		
		
		System.out.println("The supplier of Desk Chair is "+allData.get("P002").get(4));
		
	}

}
