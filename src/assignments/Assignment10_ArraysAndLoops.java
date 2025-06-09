package assignments;

public class Assignment10_ArraysAndLoops {
	
	public static void main(String[] args) {

		int[] ary = {12, 34, 11, 36, 87, 98, 93};

        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < ary.length; i++) {
            int num = ary[i];

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Second largest number in the array is: " + second);
        System.out.println("Third largest number in the array is: " + third);
	
	
	}

}
