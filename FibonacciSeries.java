package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		//to print 0 1 1 2 3 5 8 13 21 34 55
		// to initialize range = 8
		// to initialize first and second num 
		int firstNum=0,secNum=1,range=8;
		System.out.println(firstNum);
		for (int i = 0; i <=range; i++)
		
		{
	    int thirdNum=firstNum+secNum;
	    System.out.println(thirdNum);
	    firstNum=secNum;
	    secNum=thirdNum;
			
		}
			
			
	}

}
