
public class Test1 {

	public static void main(String[] args) {
		
		fact(5);

	}

	private static void fact(int n) {

		int f1 = 1;
		
		for(int i=1; i<=n; i++)
		{
			f1 = f1 * i;
			
		}
		System.out.println(f1);
	}
	
	

}
