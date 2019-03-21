package day1;

import java.util.Scanner;

public class st9012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++) {
			System.out.println(isValid(sc.nextLine()));
		}
	}
	
	public static String isValid(String s) {
		s=s.trim();
		int n=s.length();
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='(')
				cnt++;
			else if(s.charAt(i)==')')
				cnt--;
		}
		if(cnt==0)return "YES";
		else return "NO";
	}
}
