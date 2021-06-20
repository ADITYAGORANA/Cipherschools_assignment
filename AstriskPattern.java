package Assignment2;

public class AstriskPattern {
	public static void pattern(int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=size-1;j>i;j--)
				System.out.print("	");
			for(int k=0;k<=i;k++)
				System.out.print("*	");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

}
