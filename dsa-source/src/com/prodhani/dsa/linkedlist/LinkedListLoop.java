package com.prodhani.dsa.linkedlist;

import com.prodhani.dsa.linkedlist.SingleLinkedList.MyLinkedList;
import com.prodhani.dsa.linkedlist.SingleLinkedList.Node;

public class LinkedListLoop {

	
	public static void main(String[] args) {
		
		SingleLinkedList slList = new SingleLinkedList();
		slList.addNode(1);
		slList.addNode(2);
		slList.addNode(3);
		slList.addNode(4);
		slList.addNode(5);
		slList.addNode(6);
		MyLinkedList linkedList = slList.getMyLinkedList();
		slList.printList(linkedList);
		
		Node node = slList.searchNode(4);
		Node tail = linkedList.tail;
		tail.next = node; // this will cause loop.
		
		Node p = linkedList.head;
		Node q = linkedList.head;
		do{
			p=p.next;
			q=q.next.next;
		}while(p!=null && q!=null && p!=q);
		
		if(p==q){
			System.out.println("This is loop");
		}else{
			System.out.println("This is not loop");
		}
	}
}
