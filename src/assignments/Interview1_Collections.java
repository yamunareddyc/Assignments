package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview1_Collections {
	public static void main(String[] args) {
	
	List<String> emp1= new ArrayList<>();
	emp1.add("XYZ");
	emp1.add("Sr QA");
	emp1.add("Chennai");
	emp1.add("xyz@gmail.com");
	
	List<String> emp2= new ArrayList<>();
	emp2.add("ABC");
	emp2.add("QA Lead");
	emp2.add("Hyderabad");
	emp2.add("abc@gmail.com");
	
	Map<Integer,List<String>> empmap = new HashMap<>();
	empmap.put(23425665,emp1);
	empmap.put(23454676,emp2);

	System.out.println("Information of first employee is "+empmap.get(23425665)+"\n");
	
	System.out.println("Email of second employee is "+empmap.get(23454676).get(3));

}
}
