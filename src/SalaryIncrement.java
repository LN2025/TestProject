import java.util.Scanner;

public class SalaryIncrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary:");
		
		float salary = sc.nextFloat();
		
		System.out.println("Enter your rating");
		float rating = sc.nextFloat();
				
		if(rating>=1 && rating <=5 && salary>0)
		{
			if(rating>=1 && rating<=3)
			{
				salary = salary+(salary*10/100);
			}
			else if(rating>=3.1 && rating<=4)
			{
				salary = salary+(salary*25/100);
			}
			else if(rating>=4.1 && rating<=5)
			{
				salary = salary+(salary*30/100);
			}
			
			System.out.println(salary);
		
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
