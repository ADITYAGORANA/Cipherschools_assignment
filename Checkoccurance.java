package Assignment2;


public class Checkoccurance {
	public static void check(int []a, int x)
	{
		int first=0;
		int last=0;
		int ind=0;
		boolean c=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				first=i;
				ind=i;
				c=false;
				break;	
			}
		}
		for(int i=ind;i<a.length;i++)
		{
			if(a[i]==x)
				last=i;
		}
		if(c)
			System.out.println("Number does not exist");
		else
			{
			System.out.println("First Occurence:"+first);
			System.out.println("Last Occurence:"+last);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {9,3,3,4,5,3,1,2,2,5,4};
		check(array,9);
	}

}
