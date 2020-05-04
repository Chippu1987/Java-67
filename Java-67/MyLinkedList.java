/* Linked list Node*/

class Node 
{ 
 int data; 
 Node next; 
  
 // Constructor 
 Node(int data) 
 { 
  this.data = data; 
  next = null; 
 } 
}

public class MyLinkedList 
{ 
  Node head; // head of list   

  // Method to insert a new node 
  public static MyLinkedList insert(MyLinkedList list, int data) 
  { 
    // Create a new node with given data 
    Node new_node = new Node(data); 
    //new_node.next = null; 
  
    // If the Linked List is empty, then make the new node as head 
    if (list.head == null) { 
        list.head = new_node; 
    } 
    else { 
     // Else traverse till the last node and insert the new_node there 
     Node last = list.head; 
     while (last.next != null) { 
         last = last.next; 
     } //while
  
     // Insert the new_node at last node 
     last.next = new_node; 
    }//else 
  
    // Return the list by head 
    return list; 
   } 
  
    // Method to print the MyLinkedList. 
    public static void printList(MyLinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("MyLinkedList: "); 
   
        // Traverse through the MyLinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        MyLinkedList list = new MyLinkedList(); 
  
          // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
		list = insert(list, 24);
		list = insert(list, 24);
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the MyLinkedList 
        printList(list); 
    } 
} 