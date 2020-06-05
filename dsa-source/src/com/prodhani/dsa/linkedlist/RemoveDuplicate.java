package com.prodhani.dsa.linkedlist;

import com.prodhani.dsa.linkedlist.SingleLinkedList.MyLinkedList;
import com.prodhani.dsa.linkedlist.SingleLinkedList.Node;

public class RemoveDuplicate {

	public static void main(String[] args) {
		SingleLinkedList slList = new SingleLinkedList();
		slList.addNode(1);
		slList.addNode(2);
		slList.addNode(3);
		slList.addNode(4);
		slList.addNode(4);
		slList.addNode(5);
		slList.addNode(6);
		MyLinkedList linkedList = slList.getMyLinkedList();
		slList.printList(linkedList);
		
		Node p1 = linkedList.head;
		Node p2 = linkedList.head.next;
		
		do{
			if(p1.data != p2.data){
				p1 = p2;
				p2 = p2.next;
			}else{
				p1.next = p2.next;
				p2 = p2.next;
			}
		}while(p2 != null);
		System.out.println("removed duplicate");
		slList.printList(linkedList);
	}
}
