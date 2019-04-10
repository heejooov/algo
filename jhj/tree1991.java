package day3;

import java.util.Scanner;
class Node{
	char data;
	Node left, right;
	public Node(char data) {
		this.data=data;
	}
}

public class tree1991 {

	static Node root;
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<size;i++) {
			String[] input=sc.nextLine().split(" ");
			add(input[0].charAt(0),input[1].charAt(0),input[2].charAt(0));
		}
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		
		postOrder(root);
	}
	//add
	public static void add(char data,char leftD,char rightD) {
		if(root==null) {
			root=new Node(data);
			if(leftD!='.')root.left=new Node(leftD);
			if(rightD!='.')root.right=new Node(rightD);
		}else
			search(root,data,leftD,rightD);
		
	}
	public static void search(Node root, char data,char leftD, char rightD) {
		if(root==null)return;
		else if(root.data==data) {
			if(leftD!='.')root.left=new Node(leftD);
			if(rightD!='.')root.right=new Node(rightD);
		}else {
			search(root.left,data,leftD,rightD);
			search(root.right,data,leftD,rightD);
		}
	}
	 //LNR 전위
	static void inOrder(Node root) {
		if(root.left!=null)inOrder(root.left);
		System.out.print(root.data);
		if(root.right!=null)inOrder(root.right);
	}
	//NLR 중위
	static void preOrder(Node root) {
		System.out.print(root.data);
		if(root.left!=null)preOrder(root.left);
		if(root.right!=null)preOrder(root.right);
	}
	//LRN 후위
	static void postOrder(Node root) {
		
		if(root.left!=null)postOrder(root.left);
		if(root.right!=null)postOrder(root.right);
		System.out.print(root.data);
	}
}
