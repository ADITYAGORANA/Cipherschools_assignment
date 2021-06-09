class Pyramids{
	void Patrn_1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	void Patrn_2(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<(n-i);j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
	void Patrn_3(int n) {
		int m;
		m = (int)n/2;
		n = n-m;
		Patrn_1(m);
		Patrn_4(n);
	}
	void Patrn_4(int n) {
		for(int i =n;i>0;i--) {
			for(int j=i;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
	}
	void Patrn_5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=(n-i);j>0;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("* ");
			System.out.println();
		}
	}
	void Patrn_6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}	
	}
	void Patrn_7(int n) {
		int x = 1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(x+" ");
				x++;
				
			}
			System.out.println();
		}
	}
}
public class Patterns1 {

	public static void main(String[] args) {
		Pyramids p = new Pyramids();
		p.Patrn_1(5);
		System.out.println();
		p.Patrn_2(6);
		System.out.println();
		p.Patrn_4(5);
		System.out.println();
		p.Patrn_3(7);
		System.out.println();
		p.Patrn_5(5);
		System.out.println();
		p.Patrn_6(5);
		System.out.println();
		p.Patrn_7(5);
	}

}
