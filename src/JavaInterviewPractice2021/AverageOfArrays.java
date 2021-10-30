package JavaInterviewPractice2021;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import com.google.common.math.DoubleMath;

public class AverageOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// with using loop
		
		int num[] = {2,4,6,7,8,9,1,2,3,9};
		double total = 0.0;
		
		for(int e : num) {
			total = total + e;
			
		}
		System.out.println("average is : " + total/num.length);
	
		
		// with using Java 8 Streams
		
		OptionalDouble stream = Arrays.stream(num).average();
		System.out.println("average is : " + stream.getAsDouble());
			
		// with using Google Guava library
		
		double avg = DoubleMath.mean(num);
		System.out.println("average is : " + avg);
	}

}
