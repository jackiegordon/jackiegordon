package Homework;

public class homeworkq5 {

	public static void main(String[] args) {
		
		int evenTotal = 0;
		
		int oddTotal = 0;
		
		int count = 1;
		
		while (count <=20) {
			if (count % 2 ==0)
				evenTotal = evenTotal + count;
			
		} else {
			oddTotal = oddTotal + count;
		}
		count++;
		
	}
	System.out.println("While Even Total: " + Even Total);
	System.out.println("While Odd Total: " + Odd Total);

}
