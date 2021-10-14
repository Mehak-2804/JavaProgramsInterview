package JavaInterviewPractice2021;

interface Runnable{ 
	
    public void run(int speed);  
	
}
public class Lamda {
	

	    public static void main(String[] args) {  
	        int speed=100;  
	  
	        // lambda expression:   
	        Runnable r=(carSpeed)->{  
	            System.out.println("Running at the speed of "+carSpeed);  
	        };  
	        r.run(speed);
	        // specifying type of parameters
	        Runnable r1=(int carSpeed)->{  
	            System.out.println("Running at the speed of "+carSpeed);  
	        }; 
	        r1.run(speed);
	    }  
	}



