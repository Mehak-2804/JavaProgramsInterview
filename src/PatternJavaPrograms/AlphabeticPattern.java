package PatternJavaPrograms;

public class AlphabeticPattern {

	public static void main(String[] args) {
		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 
		
		int alpha = 65; // 65 is for "A" and 97 is for "a"

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alpha + j) + " ");
			}

			System.out.println();
		}

		
//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F F F 
		
		
		System.out.println("-------------");
		
		int alphaa = 65;

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print((char) alphaa + " ");
			}
				alphaa++;
				System.out.println();
				
		}

	}
}
