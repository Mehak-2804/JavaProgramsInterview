package StringIQ;

public class ConvertStringToIntegerViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3000";
		int a = Integer.parseInt(s);
		System.out.println("the actual string " + s);

		int b = 2;
		int c = a / b;
		System.out.println("conversion to int " + a);
		System.out.println(c);

	}

	public void ConversionToString() {
		int element = 20;
		int abc = 30;
		String StringElement = Integer.toString(element);

		int d = abc / element;
		System.out.println("int " + element);
		System.out.println("String " + StringElement);

	}

}
