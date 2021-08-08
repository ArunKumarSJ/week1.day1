package week1.day1;

public class AmstrongNum {

	public static void main(String[] args) {
		int n =153,temp,Armstrong=0;
		int original = n;
		while(n>0)
		{
			temp=n%10;
			temp=temp*temp*temp;
			Armstrong=Armstrong+temp;
			n=n/10;
			}
		if (Armstrong==original)
		{
		System.out.println("the number is armstrong");	
		}
		else {
			System.out.println("the number is not armstrong");
		}
	}

}
