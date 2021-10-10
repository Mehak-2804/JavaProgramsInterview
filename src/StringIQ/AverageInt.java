package StringIQ;

import java.util.Scanner;

public class AverageInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		int sumNum = 0;
		int average = 0;
		for (int i = 1; i <=50; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			num = sc.nextInt();
			average = (num / i);
			average = average + sumNum;
			System.out.println("Sum of numbers" + average);
			average = (average / i);
			sumNum = average + num;
			//average = sumNum + (num / i);

			System.out.println("Average is :" + average);

		}

	}

}
