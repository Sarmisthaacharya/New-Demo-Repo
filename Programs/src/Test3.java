import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		
		int numbers[] = new int[] {0,0,1,1,1,1,1,2,4,4,4,4,5,6,7,7};
		 
	      // list of all the numbers 
	      List<Integer> list = new ArrayList<Integer>();
	 
	      // list of all the numbers with no duplicates
	      TreeSet<Integer> tree = new TreeSet<Integer>();
	 
	      for (int i = 0; i < numbers.length; i++) {
	         list.add(numbers[i]);
	         tree.add(numbers[i]);
	      }
	 
	      System.out.println("list: " + list);
	      System.out.println("tree: " + tree);
	 
	      // Contains all the modes
	      List<Integer> modes = new ArrayList<Integer>();
	 
	      int highmark = 0;
	      for (Integer x: tree) {
	         int freq = Collections.frequency(list, x);
	         if (freq == highmark) {
	            modes.add(x);
	         }
	         if (freq > highmark) {
	            modes.clear();
	            modes.add(x);
	            highmark = freq;
	         } 
	      }
	      System.out.println("modes: " + modes);

	}

}
