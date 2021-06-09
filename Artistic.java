public class Artistic {
	void Patrn(int n) {
		int o = n;
		int m = n+1;
		System.out.print("+");
		for(int i=1;i<=2*n;i++)
			System.out.print("-");
		System.out.print("+\n");
		for(int j=1;j<=(2*n-1);j++) {
			int x;
			System.out.print("|");
			if(j==n) {
				System.out.print("<");
				for(int i=1;i<2*n-1;i++)
					if(j%2==0)
						System.out.print("-");
					else
						System.out.print("=");
				System.out.print(">");
			}
			else {
				for(x=1;x<=2*n;x++) {
					if(x==o)
						if(j<n)
							System.out.print("/");
						else
							System.out.print("\\");
					else if(x==m)
						if(j<n)
						System.out.print("\\");
						else
						System.out.print("/");
					else if(x>o && x<m) {
						if(j%2==0)
							System.out.print("-");
						else
							System.out.print("=");
					}
					else
						System.out.print(" ");
				}
			}
				if(j<n) {
					o--;
					m++;
				}
				else {
					o++;
					m--;
				}
				System.out.print("|\n");
		}
		System.out.print("+");
		for(int i=1;i<=2*n;i++)
			System.out.print("-");
		System.out.print("+");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artistic Ar = new Artistic();
		Ar.Patrn(10);
	}
}
