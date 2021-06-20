package Assignment2;

import java.util.Scanner;

public class Armstrong_number {
	public static int count(int x) {
		int n=0;
		while(x!=0) {
			x=x/10;
			++n;
		}
		return n;
	}
	
	public static void checkTheNumber(int x) {
		int n=count(x);
		int y=x;
		int sum=0;
		while(y!=0) {
//			array[i]=(int)Math.pow(y%10, n);
			sum += Math.pow(y%10, n);
			y=y/10;
			//System.out.println(array[i]);
		}
		if(sum==x)
			System.out.println("Its an Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		sc.close();
		checkTheNumber(x);
	}
}
