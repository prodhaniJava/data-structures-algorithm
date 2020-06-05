package com.prodhani.dsa.linkedlist;

import com.prodhani.dsa.linkedlist.SingleLinkedList.MyLinkedList;
import com.prodhani.dsa.linkedlist.SingleLinkedList.Node;

public class RecursiveReverse {

	
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
	
	System.out.println("sfsdfdsf");
	slList.reverseLinkedList(linkedList.head, linkedList.head.next);
	slList.printList(linkedList);
	
}
	
  


}
