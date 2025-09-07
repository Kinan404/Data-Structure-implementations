/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.LinkedList;

class Node<T> {

    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        next = null;
        prev = null;
    }

}

class Doublylinkedlistt<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    Doublylinkedlistt() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> temp = head;
        Node<T> element = new Node<>(data);
        if (head == null) {
            head = element;
            tail = element;
            size++;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = element;
            element.prev = temp;
            tail = temp;
            size++;
        }

    }

    public void addfirst(T data) {

        Node<T> element = new Node<>(data);

        if (head == null) {
            head = element;
            tail = element;
            size++;
        } else {
            element.next = head;
            head.prev = element;
            head = element;
            size++;
        }

    }

    public void addLast(T data) {

        Node<T> element = new Node<>(data);
        Node<T> temp = head;
        if (head == null) {
            head = element;
            tail = element;
            size++;
        } else {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = element;
            element.prev = temp;
            tail = element;
            size++;
        }

    }

    public void addAtposition(T find, T data) {
        Node<T> temp = head;
        Node<T> element = new Node<T>(data);
        if (head == null) {
            System.out.println("There is no element in Double linked list");
        }
        if (head.data.equals(find)) {
            head.next = element;
            element.prev = head;
            size++;
        } else if (tail.data.equals(find)) {
            tail.next = element;
            element.prev = tail;
            size++;
        } else {

            while (!temp.data.equals(find)) {
                temp = temp.next;
            }
            element.next = temp.next;
            temp.next.prev = element;
            temp.next = element;
            element.prev = temp;
            size++;

        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("No element in array !");
        } else if (tail != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            System.out.println("There is an error");
        }
    }

    public void removeat(T find) {
        Node<T> temp = head;

        if (head == null) {
            System.out.println("No element in array !");
        } else if (head.data.equals(find)) {
            head = head.next;
            head.prev = null;
            size--;
        } else if (tail.data.equals(find)) {
            tail = tail.prev;
            tail.next = null;
            size--;
        } else {

            while (temp.next != null) {
                if (temp.next.data.equals(find)) {
                    
                    
                    temp.next = temp.next.next;
                    temp.next.next.prev = temp;
                    temp.next.prev = null;

       
                    size--;
                }
                else {
                    temp = temp.next;
                }
            }
        }

    }

    public void print() {
        Node<T> temp = head;
        if (temp == null) {
            System.out.println("NO elements ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Tail value here : " + tail.data);
    }
}

public class DoublyLinkedlist {

    public static void main(String[] args) {

        Doublylinkedlistt<Integer> ob1 = new Doublylinkedlistt<>();
        ob1.addLast(1);
        ob1.addLast(2);

        ob1.addLast(3);
        ob1.addLast(4);

        ob1.print();
        ob1.removeat(2); 
        ob1.print();
    }
}
