package day1;

import java.util.Scanner;
import java.util.Stack;

public class st10828 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Stack<Integer> stack=new Stack<Integer>();
		for(int k=0;k<n;k++) {
			String line=sc.nextLine();
			String[] s=line.split(" ");
			String cmd=s[0];
			if(cmd.equals("push")) {
				stack.push(Integer.parseInt(s[1]));
			}else if(cmd.equals("top")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}else if(cmd.equals("size")) {
				System.out.println(stack.size());
				
			}else if(cmd.equals("empty")) {
				if(stack.empty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				
			}else if(cmd.equals("pop")) {
				
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.pop());
				}
			}
		}
		
	}
}
