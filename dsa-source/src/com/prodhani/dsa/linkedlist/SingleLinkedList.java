package com.prodhani.dsa.linkedlist;

import com.prodhani.dsa.linkedlist.SingleLinkedList.Node;

public class SingleLinkedList {
	
	MyLinkedList llist ;
	public SingleLinkedList(){
		  /* Start with the empty list. */
	    llist = new MyLinkedList();
	}
	
   

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }

    static class MyLinkedList{
    	 Node head;  // head of list
    	 Node tail;  // head of list
    }
    
    
    public static void main(String[] args)
    {
    	SingleLinkedList slList = new SingleLinkedList();
    	MyLinkedList llist =  slList.getList();
    	slList.printList(llist);

          Node head=slList.reverseList(llist);
          System.out.println("\n reverse list");
          slList.traversList(head);
    }
    
    public  MyLinkedList getMyLinkedList()
    {
    	return llist;
    }
    /* method to create a simple linked list with 3 nodes*/
    public  MyLinkedList getList()
    {
      

        llist.head  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);

        /* Three nodes have been allocated  dynamically.
          We have refernces to these three blocks as first,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

        llist.head.next = second; // Link first node with the second node

        /*  Now next of first Node refers to second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        second.next = third; // Link second node with the third node

        /*  Now next of second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        
		return llist;

    }
    void addNode(int data){
    	 Node node = new Node(data);
    	 if(llist.head == null){
    		 llist.head = node;
    		 llist.tail = node;
    	 }else{
    		 llist.tail.next = node;
    		 llist.tail = node;
    	 }
    }
    Node searchNode(int data){
   	
    	Node n = llist.head;
        while (n != null && n.data != data)
        {
            n = n.next;
        }
        return n;
   }
    /* This function prints contents of linked list starting from head */
     void printList(MyLinkedList llist )
    {
        Node n = llist.head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
     void traversList(Node head){
        while (head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    /* This function reverse linked list */
     Node reverseList(MyLinkedList llist )
    {
        Node head = llist.head;
        // reverse procedure same as reversing a
        // singly linked list
        Node prev = null;
        Node current = head;
        Node next = null;

        do{
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }while(current!=null);

        return prev;
    }
     void reverseLinkedList(Node first , Node second){
  	   
  	   if(second != null){
  		   reverseLinkedList(second, second.next);
  		   second.next = first;
  	   }
  	   else{
  		 llist.head = first;
  	   }
     } 
}
