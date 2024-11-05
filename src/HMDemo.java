import java.util.TreeMap;

public class HMDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> hm = new TreeMap<>();
		
		//hm.put(null, "Dhoni");
		hm.put(102, "Virat");
		hm.put(103, "Rohith");
		hm.put(104, null);
		hm.put(105, null);
		
		//hm.put(null, "Ricky");
		
		
		
		System.out.println(hm);

		//System.out.println(hm.get(null));
		
	}

}
