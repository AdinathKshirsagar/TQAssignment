package com.StarPattern;

public class SecondProgram {

	public static void main(String[] args) {
		int i, j,k;
			for(i=1 ; i<=5 ; i++)
			{
				for(j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				
				System.out.println();
			}
		
			for(i=4;i>=1; i--)
			{
				for(k =1; k<=i; k++ )
				{
					System.out.print(k);
				}
				System.out.println();
			}
	}

}
