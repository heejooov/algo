package day1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class qu10845 {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int k=0;k<=n;k++) {
			String line=sc.nextLine();
			System.out.println(k+"+++"+line);
			String[] s=line.split(" ");
			String cmd=s[0];
			if(cmd.equals("push")) {
				queue.offer(Integer.parseInt(s[1]));
			}else if(cmd.equals("pop")) {
				if(queue.isEmpty())
					System.out.println("-1");
				else
					System.out.println(queue.poll());
			}else if(cmd.equals("front")) {
				if(queue.isEmpty())
					System.out.println("-1");
				else
					System.out.println(queue.peek());
			}else if(cmd.equals("back")) {
				if(queue.isEmpty())
					System.out.println("-1");
				else ;
					//
			}else if(cmd.equals("empty")) {
				if(queue.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
			}else if(cmd.equals("size")) {
				System.out.println(queue.size());
			}
			
		}
	}
}
