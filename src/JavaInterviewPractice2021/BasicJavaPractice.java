package JavaInterviewPractice2021;

public class BasicJavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		largestSmallestNum(new int[] { 10, 40, 20, 60, 13 });

		alternateNum(new int[] { 20, 30, 40, 60, 70 });

		duplicateNum(new int[] { 10, 20, 20, 30, 40, 10 });

		swapString("mehak", "kapoor");
	}

	public static void largestSmallestNum(int ar[]) {

		int temp = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {

					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}

		}

		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);
		}

		System.out.println("largest element in Array is >>> " + ar[ar.length - 1]);

		System.out.println("smallest element in Array is >>>> " + ar[0]);
	}

	public static void alternateNum(int ar[]) {

		System.out.println("first list is >>>>");
		for (int i = 0; i < ar.length; i = i + 2) {

			System.out.println(ar[i]);

		}
		System.out.println("second list is >>>>");

		for (int i = 1; i < ar.length; i = i + 2) {
			System.out.println("alternate number in array is: "+ar[i]);
		}

	}

	public static void duplicateNum(int ar[]) {

		System.out.println("duplicate num is >>>>");

		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] == ar[j]) {
					System.out.println("duplicate number in array is: "+ar[j] + " ");

				}
			}
		}
	}

	public static void swapString(String str1, String str2) {

		System.out.println("Strings Before Swapping 1st String:: " + str1 + "\n 2nd String:: " + str2);
		// In Println method \n is used to print in nextline
		// IN Printf method we %n to print the some part of message in nextline
		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());

		str1 = str1.substring(str2.length());

		System.out.println("Strings After Swapping 1st String:: " + str1 + "\n 2nd String:: " + str2);
		System.out.println("Strings Before Swapping ::" + str1 + str2);

	}

}
