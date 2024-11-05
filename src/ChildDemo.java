
public class ChildDemo extends InheritDemo {

	void showDemo()
	{
		super.showDemo();
		System.out.println("I am a method of Child Class");
	}
	
	
	public static void main(String[] args) {
	
		ChildDemo cd = new ChildDemo();
		cd.showDemo();
		
	}
	
}
