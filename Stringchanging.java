package Assignment2;

public class Stringchanging {
	public static void changeCase(String s)
	{
		int n=s.length();
		char c[]=new char[n];
		String t = new String(c);
		for(int i=0;i<n;i++)
		{
			if((int)s.charAt(i)>=97)
			{
				c[i] = (char)((int)s.charAt(i) - 32);
			}
			else if((int)s.charAt(i)>=65 && (int)s.charAt(i)<91)
			{
				c[i] = (char)((int)s.charAt(i) + 32);
			}
			t = new String(c);
		}
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		String s1 = "ProGraMMer";
//		System.out.println(s1[3]);
		changeCase(s1);

	}

}
