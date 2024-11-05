
public class DemoClass {

	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	static float sum(float a, float b) {
		return a+b;
	}

	public static void main(String[] args) {
	
	int result = sum(2,4);
	System.out.println(result);

	result = sum(5,10,15);
	System.out.println(result);
	
	float f = sum(2.2f, 3.1f);
	
	System.out.println(f);
	}

}
