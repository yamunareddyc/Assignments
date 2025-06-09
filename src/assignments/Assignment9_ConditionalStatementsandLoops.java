package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_ConditionalStatementsandLoops {
	
	
	public static void main(String[] args) {
		
		
		Float[] emp1 = {75000.0f,5.1f,4.2f};
		Float[] emp2 = {68000.0f,3.2f,3.8f};
		Float[] emp3 = {82000.0f,7.1f,4.5f};
		Float[] emp4 = {90000.0f,10.2f,2.5f};
		Float[] emp5 = {60000.0f,2.4f,3.5f};


		Map<String,Float[]> empTab = new HashMap<>();
		
		empTab.put("Alice Johnson",emp1);
		empTab.put("Bob Smith",emp2);
		empTab.put("Carol Davis",emp3);
		empTab.put("David Brown",emp4);
		empTab.put("Eva Green",emp5);
		
		Map<String,Float> hikeEmpTab = new HashMap<>();
		
		
		empTab.forEach((key,value)->
		{
			Float varPay;
			Float bonus;
			Float reward;
			
	//varPay and bonus calculation
			
			if(value[2]>=4.0)
			{
				varPay=15.0f;
				bonus=1500.0f;
			}
			else if(value[2]<4 && value[2]>=3)
			{
				varPay=10.0f;
				bonus=1200.0f;
			}
			else
			{
				varPay=3.0f;
				bonus=300.0f;
			}
			
	//reward calculation
			
			if(value[1]>=5)
			{
				reward=5000.0f;
			}
			else
			{
				reward=0.0f;
			}
			
			Float hike = (value[0]*varPay)+bonus+reward;
			
			Float hikePer = hike/value[0];
			
			hikeEmpTab.put(key,hikePer);
			
		});
		
		System.out.println(hikeEmpTab);
	}

}
