import java.util.ArrayList;
import java.util.List;

public class Size {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		
		li.add("Ram");
		li.add("A2");
		li.add("Shyam");

		System.out.println(li.size());
		
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		
		for (String c: li)
		{
			System.out.println(c);
		}
		
	}

}
