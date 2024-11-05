import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter first number:");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number:");
		int secondNumber = sc.nextInt();
	
		int result = firstNumber / secondNumber;
		
		System.out.println(result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
		System.out.println("Success");
		}
	}
}
