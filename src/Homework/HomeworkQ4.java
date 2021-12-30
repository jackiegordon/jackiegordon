package Homework;

public class HomeworkQ4 {

	public static void main (String[] args) {
		
		int evenTotal = 0;
		int oddTotal = 0;
		
	for (int i = 1; 1<= 20; i++) {
		
		if (1 % 2 == 0) {
			
			//even
			evenTotal = evenTotal + i ;
			
		} else {
			//odd
			oddTotal = oddTotal + i;
			
		}
	}
	{
	System.out.println("Even Total: " + evenTotal);
	System.out.println("Odd Total: " + evenTotal);
	
	}
}

	
}
}
}