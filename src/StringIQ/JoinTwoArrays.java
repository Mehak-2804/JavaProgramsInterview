package StringIQ;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("using Java 8 Streams >>>>>");
		JoinArrayStreams(new String[] { "Mehak", "Reena", "Nisha" }, new String[] { "Orange", "Red", "Black" });
		
		System.out.println("using Guava library >>>>>");
		JoinArraysGuava(new String[] { "Mehak", "Reena", "Nisha" }, new String[] { "Orange", "Red", "Black" });
	}

	// using Java 8 Streams >>>>
	
	public static void JoinArrayStreams(String arr1[], String arr2[]) {

		Stream<String> stream1 = Arrays.stream(arr1);
		Stream<String> stream2 = Arrays.stream(arr2);

		String[] joinString = Stream.concat(stream1, stream2).toArray(size -> new String[size]);

		for (String s : joinString) {
			System.out.println(s);
		}
	}

	// using Guava library >>>>
	
	public static void JoinArraysGuava(String arr1[], String arr2[]) {
	/*    
	 *    String joinString[] = ObjectArrays.concat(arr1 , arr2 , String.class);
	 * 	  for(String s : joinString){
	 *    System.out.println(s);
	 */
	}
	
	// for primitive types
	
	public static void primitiveArraysJoin(int arr1[] , int arr2[]) {
		
	/*
	 * 	 int joinArray[] = Ints.concat(arr1 , arr2);
	 *   for( int a : joinArray){
	 *   System.out.println(a);
	 *   }
	 */
		
	}
	
	
}
