
public class Fact {

	public static void main(String[] args) {
		
		fact1(5);
	}
		
		public static void fact1(int num)
		{
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println(fact);
		}
	

	
}
