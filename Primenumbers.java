package Assignment2;

public class Primenumbers {
	public static void findPrime(int x,int y)
	{
		for(int i=x;i<=y;i++)
		{	
			boolean c=true;
			for(int j=2;j<=Math.pow(i, 0.5);j++)
			{
				if(i%j==0)
				{
					c=false;
					break;
				}
			}
			if(c)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		findPrime(6,24);
	}

}
