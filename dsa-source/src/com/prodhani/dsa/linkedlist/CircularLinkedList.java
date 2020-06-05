package com.prodhani.dsa.linkedlist;

public class CircularLinkedList {

    static Node head, head1, head2;

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(){}
        Node(int data)  { this.data = data;  next=null; } // Constructor
    }

    static Node addToEmpty(Node last, int data)
    {
        // This function is only for empty list
        if (last != null)
            return last;

        // Creating a node dynamically.
        Node temp = new Node();

        // Assigning the data.
        temp.data = data;
        last = temp;

        // Creating the link.
        last.next = last;

        return last;
    }

    /* Function to insert a node
        at the beginning of a Circular
        linked list */
    static Node push(Node head_ref,int data)
    {
        Node ptr1 = new Node();
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;

        /* If linked list is not null
        then set the next of last node */
        if (head_ref != null)
        {
            while (temp.next != head_ref)
                temp = temp.next;

            temp.next = ptr1;
        }
        else
            ptr1.next = ptr1;

        head_ref = ptr1;

        return head_ref;
    }

    /* Function to split a list (starting with head) into two lists.
     head1_ref and head2_ref are references to head nodes of
     the two resultant linked lists */
    static void splitList() {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head == null) {
            return;
        }

        /* If there are odd nodes in the circular list then
         fast_ptr->next becomes head and for even nodes
         fast_ptr->next->next becomes head */
        while (fast_ptr.next != head
                && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }

        /* If there are even elements in list then move fast_ptr */
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }

        /* Set the head pointer of first half */
        head1 = head;

        /* Set the head pointer of second half */
        if (head.next != head) {
            head2 = slow_ptr.next;
        }
        /* Make second half circular */
        fast_ptr.next = slow_ptr.next;

        /* Make first half circular */
        slow_ptr.next = head;
    }


    /* Function to print nodes in a
        given Circular linked list */
    static void printList(Node head)
    {
        Node temp = head;
        if (head != null)
        {
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }



    // Driver Code
    public static void main(String args[])
    {
        /* Initialize lists as empty */
        Node head = null;

    /* Created linked list will
       be 11.2.56.12 */
        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);

        System.out.println("Contents of Circular " +"Linked List:");
        printList(head);
        splitList();
        printList(head1);
        printList(head2);

    }

}
