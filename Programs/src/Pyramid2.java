
public class Pyramid2 {

	public static void main(String[] args) {
		
		int k=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=k; j++)
			{
				System.out.print(" ");
			}
				
			
			for(int m=1; m<=i; m++)
			{
				System.out.print("* ");
			}
		k--;
		
		System.out.println(" ");
		
		}
		
		
		

	}

}