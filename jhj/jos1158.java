package day1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class jos1158 {

	public static void main(String[]args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		sb.append("< ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(n+"  "+m);
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<m-1;i++) {
				queue.offer(queue.poll());
			}sb.append(queue.poll()+", ");
			
		}
		sb.append(queue.poll());
		sb.append(" >");
		System.out.println(sb);
		
		
	}
}
