package com.prodhani.dsa.tree;

import java.util.Scanner;

import com.prodhani.dsa.linkedlist.LinkedListQueue;
import com.prodhani.dsa.linkedlist.LinkedListStack;
import com.prodhani.dsa.linkedlist.Node;

public class BinaryTree {
	LinkedListQueue queue = new LinkedListQueue();
	static String design = "****************************************************************************************************************************";

	public static void main(String[] args) {
		System.out.print(design);
		BinaryTree bt = new BinaryTree();
		Node root = bt.createBinaryTree();
		bt.lavelOrderTraversal(root);
		bt.traversePreOrderRecursive(root);
		bt.traverseInOrderRecursive(root);
		bt.traversePostOrderRecursive(root);
		bt.traversePreOrderIterative(root);
		bt.traverseInOrderIterative(root);
		bt.traversePostOrderIterative(root);
		BTreePrinter.printNode(root);
	}
	void lavelOrderTraversal(Node root){
		System.out.println("*************** lavelOrderTraversal *************8");
		if(root == null){
			return;
		}
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue(root);
		System.out.println(root.value);
		while(!queue.isEmpty()){
			Node temp = queue.dequeue();
			if(temp.left != null){
				System.out.print(temp.left.value);
				queue.enqueue(temp.left);
			}
			System.out.print(" ");
			if(temp.right != null){
				System.out.print(temp.right.value);
				queue.enqueue(temp.right);
			}
			System.out.println(" ");
		}
	}
	void traversePreOrderRecursive(Node root){
		if(root == null){
			return;
		}
		System.out.println(root.value);
		traversePreOrderRecursive(root.left);
		traversePreOrderRecursive(root.right);
	}
	void traversePreOrderIterative(Node root){

		System.out.println("******** traverseInOrderRecursive ********");
		LinkedListStack stack = new LinkedListStack();
		Node temp = root;
		while(temp!=null || !stack.isEmpty()){
			
			if(temp!=null){
				System.out.print(temp.value);
				stack.push(temp);
				temp = temp.left;
			}else{
				temp = stack.pop();
				temp = temp.right;
			}
		}
		System.out.println();
	}
	void traverseInOrderRecursive(Node root){
		if(root == null){
			return;
		}
		traverseInOrderRecursive(root.left);
		System.out.println(root.value);
		traverseInOrderRecursive(root.right);
	}
	void traverseInOrderIterative(Node root){

		System.out.println("******** traverseInOrderIterative ********");
		LinkedListStack stack = new LinkedListStack();
		Node temp = root;
		while(temp!=null || !stack.isEmpty()){
			
			if(temp!=null){
				stack.push(temp);
				temp = temp.left;
			}else{
				temp = stack.pop();
				System.out.print(temp.value);
				temp = temp.right;
			}
		}
		System.out.println();
	}
	
	void traversePostOrderRecursive(Node root){
		if(root == null){
			return;
		}
		traverseInOrderRecursive(root.left);
		traverseInOrderRecursive(root.right);
		System.out.println(root.value);
		
	}
	void traversePostOrderIterative(Node root){
		System.out.println("******** traversePostOrderIterative ********");
		LinkedListStack stack = new LinkedListStack();
		Node temp = root;
		while(temp!=null || !stack.isEmpty()){
			
			if(temp!=null){
				stack.push(temp);
				temp = temp.left;
			}else{
				temp = stack.pop();
				if(!temp.isPrint){
					temp.isPrint = true;
					stack.push(temp);
					temp = temp.right;
				}else{
					System.out.print(temp.value);
					temp = null;
				}
				
			}
		}
		System.out.println();
	}
    Node createBinaryTree(){
    	
		System.out.print("Enter Root Node value  ");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt();
		Node root = queue.enqueue(a);
		while(!queue.isEmpty()){
			Node node = queue.dequeue();
			enterLeftChild(node);
			enterRightChild(node);
		}
		return root;
	}
	void enterLeftChild(Node root ){
		System.out.print("Enter Left child or enter or enter 0 to no ");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt();
		if(a == 0){
			return;
		}
		Node node = queue.enqueue(a);
		if(root != null){
			root.left=node;
		}
	}
	void enterRightChild(Node root ){
		System.out.print("Enter Right child or enter or enter 0 to no ");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt();
		if(a == 0){
			return;
		}
		Node node = queue.enqueue(a);
		if(root != null){
			root.right=node;
		}
	}
	
	
}
