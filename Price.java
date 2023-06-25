package com.array;

public class Price {
	
	public static void main(String[] args) {
		 float a[]=new float[3];
		 a[0]=0.5556f;
		 a[1]=1.444455618f;
		 a[2]=2.9876433f;
		 
		 System.out.println("Price of items:");
		 
		 for (float f : a) {
			System.out.println(f);
		}
		 for (int i = 0; i<a.length; i++) {
			 System.out.println(a[i]);
			
		}
	}

}
