package com.prodhani.dsa.linkedlist;

public class LinkedListStack {
	
	public Node top;
	public LinkedListStack() 
    { 
        this.top = null; 
    } 
	
	public Node push(Node temp){
		// Create a new LL node 
		temp.next = top;
        top = temp;
        return top; 
	}
	public Node pop(){
		Node temp = top;
		top = top.next;
        return temp; 
	}
	public Node top(){
        return top; 
	}
	public void display(){
		Node temp = top;
		System.out.println("*****************************");
		while(temp != null){
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public boolean isEmpty(){
		return this.top == null;
	}
	
	public static void main(String[] args) {
		LinkedListStack q = new LinkedListStack(); 
		Node temp = new Node(10);
		q.push(temp); 
		temp = new Node(10);
		q.push(temp); 
		q.display(); 
        q.pop(); 
        q.pop(); 
        q.display(); 
        temp = new Node(30);
        q.push(temp);  
        temp = new Node(40);
        q.push(temp); 
        temp = new Node(50);
        q.push(temp); 
        q.display(); 
        q.pop(); 
        q.display(); 
        
	}
}
