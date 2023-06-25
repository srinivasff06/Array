package com.array;

import java.util.Arrays;
import java.util.Collections;

public class Eg {
	public class DescendingOrderNum {
	    public static void main(String[] args) {
	        Integer[] arr = { 5, 2, 1, 8, 10 };
	        Arrays.sort(arr, Collections.reverseOrder());
	        
	        for (int values : arr) {
	            System.out.print(values + ", ");
	        }
	    }

}}