package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		
		Assignment3_Employees empdata = new Assignment3_Employees();
		
		String[] empnamearray = {empdata.empName1,empdata.empName2,empdata.empName3};
		
		int[] empidarray = {empdata.empID1,empdata.empID2,empdata.empID3};
		
		
		System.out.printf("Employee-1 name is %s and ID is %d\n",empnamearray[0],empidarray[0]);
		System.out.printf("Employee-2 name is %s and ID is %d\n",empnamearray[1],empidarray[1]);
		System.out.printf("Employee-3 name is %s and ID is %d\n",empnamearray[2],empidarray[2]);
		
		}

	}
