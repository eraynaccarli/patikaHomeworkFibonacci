package patikaOdevFibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n1= 0;
		int n2 = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number: ");
		
		int number = sc.nextInt();
		
		
		System.out.print(n1 + " " + n2); // 0 ve 1 t�m fibonaccilerde oldugu i�in yazd�rd�k
	
		// s�f�r ve bir her zaman oldugu icin yukarda yazd�r�p 2 den baslatt�k
		for(int i = 2; i < number; ++i) {
			int n = n1 + n2;
			System.out.print(" " + n);
			n1 = n2;
			n2 = n;
		}
		System.out.println();
	}
	
}
