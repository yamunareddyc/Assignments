package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//Number of subjects in all semesters
		String[] semsubjects = {"Subject 1","Subject 2","Subject 3","Subject 4","Subject 5","Subject 6"};
		
		
	//Data for Semmester 1
		
		String[] sem1status = {"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"};
		
		String[] sem1subjectnames = {"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electric Engineering"};
		String[] sem1marks= {"78","85","21","74","88","79"};
		
		String[][] sem1array1 = {semsubjects,sem1status};
		String[][] sem1array2 = {sem1subjectnames,sem1marks};
		
		String[][][] semester1 = {sem1array1,sem1array2};
		
		
	//Data for semester 2
		
		String[] sem2status = {"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
		
		String[] sem2subjectnames = {"Mathematics II","Mechanics","Environmental Sci","Basic Electronics","Engineering Physics","Engineering Graphics"};
		String[] sem2marks= {"82","77","93","19","24","90"};
		
		String[][] sem2array1 = {semsubjects,sem2status};
		String[][] sem2array2 = {sem2subjectnames,sem2marks};
		
		String[][][] semester2 = {sem2array1,sem2array2};
		
	//Data for semester 3
		
				String[] sem3status = {"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"};
				
				String[] sem3subjectnames = {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog"};
				String[] sem3marks= {"88","81","76","32","85","78"};
				
				String[][] sem3array1 = {semsubjects,sem3status};
				String[][] sem3array2 = {sem3subjectnames,sem3marks};
				
				String[][][] semester3 = {sem3array1,sem3array2};
				
	//Data for semester 4
				
				String[] sem4status = {"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"};
				
				String[] sem4subjectnames = {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng","Software Engineering"};
				String[] sem4marks= {"91","73","19","80","76","87"};
				
				String[][] sem4array1 = {semsubjects,sem4status};
				String[][] sem4array2 = {sem4subjectnames,sem4marks};
				
				String[][][] semester4 = {sem4array1,sem4array2};
				
	//Data for semester 5
				
				String[] sem5status = {"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"};
				
				String[] sem5subjectnames = {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
				String[] sem5marks= {"86","88","84","95","73","90"};
				
				String[][] sem5array1 = {semsubjects,sem5status};
				String[][] sem5array2 = {sem5subjectnames,sem5marks};
				
				String[][][] semester5 = {sem5array1,sem5array2};	
		
		
		System.out.printf("Semester 2 Subject 4 is %S and Subject 5 is %S \n",semester2[1][0][3],semester2[1][0][4]);
		
		System.out.printf("Status/Marks of Semester 4 Subject 3 is %S and Subject 6 is %S",semester4[0][1][2],semester4[0][1][5]);
		
	}

}
