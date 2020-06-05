package com.prodhani.dsa.tree;

import com.prodhani.dsa.linkedlist.LinkedListStack;
import com.prodhani.dsa.linkedlist.Node;

/**
 * binary tree in ascending order - left ,root , right.
 * 
 * @author rezaul.prodhani
 *
 */
public class BinarySearchTree {

	
	static Node root;
	Node createBSTFromPreOrder(int[] intArray){
		
		int n = intArray.length;
		int i = 0;
		Node root = new Node(intArray[i++]);
		Node temp = root;
		LinkedListStack stack = new LinkedListStack();
		while(i<n){
			int value = intArray[i];
			Node node = new Node(value);
			if(value<temp.value){
				stack.push(node);
				temp.left =node;
				temp = node;
				i++;
			}else if(stack.top() == null || value<stack.top().value){
				temp.right =node;
				temp = node;
				i++;
			}else{
				temp = stack.pop();
			}
		}
		return root;
		
	}

	void createBStree(int key){
		
		if(root == null){
			root = new Node(key);
			return;
		}
		Node temp = null,next=root;
		while(next != null){
			temp = next;
			if(key<next.value){
				next = next.left;
			}else if(key>next.value){
				next = next.right;
			}else{
				temp = null;
				return;
			}
		}
		if(temp != null){
			Node newNode= new Node(key);
			if(newNode.value<temp.value){
				temp.left= newNode;
			}else{
				temp.right= newNode;
			}
		}
		
	}
	
	void searchNode(int key){
		Node temp = root;
		while(temp != null){
			if(temp.value == key){
				break;
			}else if(key <temp.value){
				temp = temp.left;
			}else{
				temp = temp.right;
			}
		}
		if(temp != null){
			System.out.println("Node found key "+temp.value +" and left child "+temp.left +" right child "+temp.right );
		}else{
			System.out.println("No Node found for "+key);
		}
	}
	
	void inOrderTraverse(Node root){
		if(root == null){
			return;
		}
		inOrderTraverse(root.left);
		System.out.print(root.value+" ");
		inOrderTraverse(root.right);
	}
	
    Node inPreFixNode(Node node){
		while(node != null && node.right != null){
			node = node.right;
		}
		return node;
	}
    Node inPostFixNode(Node node){
		while(node != null && node.left != null){
			node = node.left;
		}
		return node;
	}
    int height(Node node){
		int x,y;
		if(node == null){
			return 0;
		}
		x = height(node.left);
		y = height(node.right);
		return x>y?x+1:y+1;
	}
	
	Node  deleteNode(Node node, int key){
		if(node == null){
			return null;
		}
		if(node.left == null && node.right == null ){
			if(node == root){
				root = null;
			}
			return null;
		}
		if(key<node.value){
			node.left = deleteNode(node.left, key);
		}else if(key>node.value){
			node.right = deleteNode(node.right, key);
		}else{
			if( height(node.left)>height(node.right)){
				Node q = inPreFixNode(node.left);
				node.value = q.value;
				node.left = deleteNode(node.left, q.value);
			}else{
				Node q = inPostFixNode(node.right);
				node.value = q.value;
				node.right = deleteNode(node.right, q.value);
			}
		}
		
		return node;
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.createBStree(50);
		bst.createBStree(30);
		bst.createBStree(30);
		bst.createBStree(14);
		bst.createBStree(70);
		bst.createBStree(80);
		bst.createBStree(50);
		bst.createBStree(100);
		bst.createBStree(200);
		
		bst.createBStree(55);
		bst.createBStree(45);
		bst.inOrderTraverse(root);
		System.out.println();
		BTreePrinter.printNode(root);
		
		 
		bst.searchNode(70);
		bst.searchNode(200);
		
		bst.deleteNode(root, 70);
		bst.inOrderTraverse(root);
		System.out.println();
		BTreePrinter.printNode(root);
		
		
		Node pRoor = bst.createBSTFromPreOrder(new int[]{50,14, 30 ,45 ,50, 55});
		BTreePrinter.printNode(pRoor);
		
	}
}
