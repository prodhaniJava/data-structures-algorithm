package com.prodhani.dsa.linkedlist;

public class Node {
	public int value;
	public boolean isPrint;
	public Node left,right; // for tree 
	Node next;
	public Node(int value) 
    { 
        this.value = value; 
        this.next = null; 
        this.left=this.right=null;
    }
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	} 
	
}
