package patikaOdevFibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n1= 0;
		int n2 = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number: ");
		
		int number = sc.nextInt();
		
		
		System.out.print(n1 + " " + n2); // 0 ve 1 tüm fibonaccilerde oldugu için yazdýrdýk
	
		// sýfýr ve bir her zaman oldugu icin yukarda yazdýrýp 2 den baslattýk
		for(int i = 2; i < number; ++i) {
			int n = n1 + n2;
			System.out.print(" " + n);
			n1 = n2;
			n2 = n;
		}
		System.out.println();
	}
	
}
