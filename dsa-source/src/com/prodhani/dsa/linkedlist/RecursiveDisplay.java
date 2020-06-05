package com.prodhani.dsa.linkedlist;

import com.prodhani.dsa.linkedlist.SingleLinkedList.MyLinkedList;

public class RecursiveDisplay {
	
	public static void main(String[] args) {
		
		SingleLinkedList slList = new SingleLinkedList();
    	MyLinkedList llist =  slList.getList();
		System.out.println("Forward display");
		displayForward(llist.head);
		System.out.println("Backward display");
		displayBackward(llist.head);
		
	}
	
	static void displayForward(SingleLinkedList.Node node){
		if(node != null){
			System.out.println(node.data);
			displayForward(node.next);
		}
	}
	
	static void displayBackward(SingleLinkedList.Node node){
		if(node != null){
			displayForward(node.next);
			System.out.println(node.data);
		}
	}
}
