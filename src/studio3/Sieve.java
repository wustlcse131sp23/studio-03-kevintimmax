package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		int index=2;
		int sieveAdd = 2;
				
		
		Scanner in = new Scanner(System.in);
		System.out.println("What's the maximum number? (n inclusive)");
		int n = in.nextInt();
		
		//int[] numbers = new int[n-1];
		
		//for (int i = 0; i < (n-1); i++) 
		//	{
		//	numbers[i] = i+2;
		//	};
		boolean[] isComposite = new boolean[n-1];
		
		while (sieveAdd<=n)
		{
			while (index<n)
			{
				
				if ((index+sieveAdd-2)<n-1)
				{	
					isComposite[index+sieveAdd-2]=true;
					
				}
				index=index+sieveAdd;
			}
			sieveAdd++;
			index=sieveAdd;
		}
		for (index=0; index<n-1; index++)
		{
			if(isComposite[index] == false)
			{
				System.out.print((index+2) + " ");
			
		}
	}
	}
}
