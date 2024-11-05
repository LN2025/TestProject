
public class TypeCastDemo {

	public static void main(String[] args) {
		
		int i=10;
		
		System.out.println(i+10);
		
		String s = String.valueOf(i);
		
		System.out.println(s+10);
		
		int j = Integer.parseInt(s);
		
		Float f = Float.parseFloat(s);
		
		Double d = Double.parseDouble(s);
		
		System.out.println(i+j+f+d);
	}
}
