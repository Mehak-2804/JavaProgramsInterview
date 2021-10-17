package JavaInterviewPractice2021;

public class MissingNumberArray {

	public static void main(String[] args) {
		// given input

		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

		// let's create another array with same length
		// by default all index will contain zero
		// default value for int variable

		int[] register = new int[input.length];

		// now let's iterate over given array to
		// mark all present numbers in our register
		// array
		
		for (int i : input) {
			register[i] = 1;
		}
		// now, let's print all the absentees
		System.out.println("missing numbers in given array");
		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}
		
		printMissingNumbers(new int[] {2 , 4, 6, 8} );
	}
	
	
	
	private static void printMissingNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
		int value = Math.abs(array[i]);
		if (array[value - 1] > 0) {
		array[value - 1] = -array[value - 1];
		}
		}

		for (int i = 0; i < array.length - 1; i++) {
		if (array[i] > 0) {
		System.out.println(i + 1);
		}
		}
		}
}