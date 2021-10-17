package JavaInterviewPractice2021;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> arList = new ArrayList<Integer>();
		arList.add(100);
		arList.add(120);
		arList.add(130);
		arList.add(10);
		arList.add(40);
		
		Stream<Integer> stream = arList.stream();
		
		int max = stream.max((x,y)->x>y?1:-1).get();
		
		System.out.println("max_value is >>>"+max);
		
		int min = arList.stream().min((x,y)->x<y?-1:1).get();
		
		System.out.println("min_value is >>>"+min);
		
		
		
	}

}
