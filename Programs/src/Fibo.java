
public class Fibo {

	public static void main(String[] args) {

		fibo1(10);
	}
	
	public static void fibo1(int num)
	{
		
		int f1=0;
		int f2=1;
		
		System.out.print(f1 + " " + f2);
		
		for(int i=2; i<num; i++)
		{
			int f3=f1+f2;
			
			System.out.print(" " + f3);
			f1=f2;
			f2=f3;
			
			
			
			
		}
		
		
	}

}
