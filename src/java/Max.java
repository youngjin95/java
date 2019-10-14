//백준 알고리즘 2562문제
package java;

import java.util.Scanner;

public class Max {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int [] arr = new int[9];			
		
		for(int i = 0 ; i < arr.length ; i ++)
		{
			arr[i]=sc.nextInt();	
		}
		
		int max = arr[0];			 
		int index = 0 ;			
		
		for(int i = 1 ; i < arr.length ; i ++)
		{
			if(arr[i] > max) 			
			{							
				max = arr[i];
				index = i+1;		
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
}
