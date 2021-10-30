package JavaInterviewPractice2021;

import java.util.Arrays;

public class ShiftAllZeroRight {

	private static int[] shiftZeroToRight(int[] a) {

		if (a.length == 1) {
			return a;
		}
		int newArray[] = new int[a.length];
		int count = 0;
		for (int number : a) {
			if (number != 0) {
				newArray[count] = number;
				count++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = new int[] { 1, 3, 0, 5, 6, 0, 0, 3 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 3, 0, 5, 6, 0, 0, 3 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 3, 0, 0, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0, 1, 0, 3, 4, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0, 0, 0, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1, 1, 1, 1 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 1 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

		i = new int[] { 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

	}

}
