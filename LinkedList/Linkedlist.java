package datastructure.LinkedList;

import java.util.LinkedList;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;

    }  
}

class sLinkedlist {

    Node head;
    int size;

    public void Append(int item) {
        Node n = new Node(item);
        if (head == null) {
            head = n;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public void Appendatbeganing(int item) {
        Node n = new Node(item);
        n.next = head;
        head = n;
    }

    public void Appendatinspe(int atvalue, int item) {
        Node n = new Node(item);
        Node temp = head;
        while (temp.data != atvalue && temp.next != null) {
            temp = temp.next;
        }
        if (temp != null) {
            n.next = temp.next;
            temp.next = n;
        }
        

    }
    public void delete(int item) {
        if(head == null) {
            System.out.println("No element in linkedlist !"); 
            return;
        }
        if(head.data == item) {
            head = head.next;
            System.out.println("Element has been deleted succesfully");
            return;
        }
        Node temp = head;
        while(temp != null) {
            if(temp.next.data == item) {
                temp.next = temp.next.next;
                return ;
            }
        }        
    }
    
    public void deleteend() {
        if(head == null) {
            System.out.println("No element in linkedlist !"); 
            return;
        }
       
        Node temp = head;
        while(temp != null) {
            if(temp.next.next == null) {
                temp.next = null;
                return ;
            }
            temp = temp.next;
        }
        
    }    
    public void traverse() {
        Node current = head;
        while (current.next != null) {
            System.out.println("Value -> " + current.data);
            current = current.next;
        }
        System.out.println("Value -> " + current.data);

    }
    
    
    
  
    public int getoddnumbersITR(sLinkedlist list) {
        Node temp = list.head;
        int count = 0;
        while(temp != null) {
            if (temp.data % 2 == 0) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
    
    
int countOddRecursive(sLinkedlist list) {
    return countOddHelper(list.head);
}

int countOddHelper(Node node) {
    if (node == null)
        return 0;

    if (node.data % 2 != 0)
        return 1 + countOddHelper(node.next);
    else
        return countOddHelper(node.next);
}
    
    
    
    

}

public class Linkedlist {

    public static void main(String[] args) {
        sLinkedlist slist = new sLinkedlist();
        slist.Append(10);
        slist.Append(20);
        slist.Append(30);
        slist.Append(40);


    }
}
