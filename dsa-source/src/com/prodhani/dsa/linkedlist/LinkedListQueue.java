package com.prodhani.dsa.linkedlist;

public class LinkedListQueue {
	
	public Node front,rear;
	public LinkedListQueue() 
    { 
        this.front = this.rear = null; 
    } 
	
	public Node enqueue(int value){
		// Create a new LL node 
		Node temp = new Node(value); 
  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return temp; 
        } 
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
        return temp; 
	}
	public Node enqueue(Node temp){  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return temp; 
        } 
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
        return temp; 
	}
	public Node dequeue(){
		// If queue is empty, return NULL. 
        if (this.front == null) 
            return null; 
        // Store previous front and move front one node ahead 
        Node temp = this.front; 
        this.front = this.front.next; 
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null; 
		return temp;
	}
	
	public boolean isEmpty(){
		return this.front == null;
	}
	
	public static void main(String[] args) {
		LinkedListQueue q = new LinkedListQueue(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        System.out.println("Queue Front : " + q.front.value); 
        System.out.println("Queue Rear : " + q.rear.value); 
	}
}
