package assignments;

public class Assignment6_Operators {
	public static void main(String[] args) {
		//Array1
		
				String[] studentNames = {"Suresh","Mahesh","Naresh"};
				
		//Array2
				
				int[] marks = {75,80,82};
				
		//new Array
				
				int[] newMarks = {marks[0]+10,marks[1]+10,marks[2]+10};
				
				System.out.println("Updated Marks:");
				System.out.println(studentNames[0]+": "+ newMarks[0]);
				System.out.println(studentNames[1]+": "+ newMarks[1]);
				System.out.println(studentNames[2]+": "+ newMarks[2]);
				
				
		//Average
				
				float avg = (newMarks[0]+newMarks[1]+newMarks[2])/newMarks.length ;
				
				System.out.printf("Average marks: %.1f",avg);

	}

}
