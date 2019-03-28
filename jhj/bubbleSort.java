package day2;

import java.util.Scanner;
//2947
public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]n=new int [5];
		for(int i=0;i<n.length;i++)
			n[i]=sc.nextInt();
		for(int k=n.length-1;k>=0;k--) {
			for(int i=0;i<k;i++) {
				if(n[i]>n[i+1]) {
					int temp=n[i];
					n[i]=n[i+1];
					n[i+1]=temp;
					for(int t=0;t<n.length;t++) {
						System.out.print(n[t]+" ");
					}
					System.out.println();
				}
				
			}
			
		}
	
		
	}
}
