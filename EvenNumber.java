package com.array;

public class EvenNumber {
	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 2;
		a[2] = 6;
		a[1] = 4;
		a[3] = 8;
		int b[] = new int[3];
		b[0] = 1;
		b[1] = 3;
		b[2] = 5;
		
		//forloop

		System.out.println("Even numbers:");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
			//foreach

		}System.out.println("Odd numbers:");
		for (int i : b) {
			System.out.println(i);
			
		}

	}

}
