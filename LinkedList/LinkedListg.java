/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.LinkedList;


 class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
} 

class LinkedListt<T> {

    private Node<T> head;

    public void addFirst(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertAfter(T data, T search) {
        Node<T> newNode = new Node<T>(data);

        Node<T> temp = head;
        while (!temp.data.equals(search) && temp.next != null) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public boolean remove(T data) {
        if (head == null) {
            System.out.println("Empty list !");
            return false;
        }

        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty list");
        }
        Node<T> temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void removeduplicat() {
        Node<T> temp = head;
        if (temp != null) {
            while (temp.next != null) {
                if (temp.next.data.equals(temp.data)) { // Use .equals() for object comparison
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        } else {
            System.out.println("can not point");
        }
    }

}

public class LinkedListg {

    public static void main(String[] args) {

        LinkedListt<Integer> list = new LinkedListt<Integer>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(20);

        list.addLast(30);
        list.addLast(40);
        list.addLast(40);
        list.removeduplicat();
        list.print();

    }
}
