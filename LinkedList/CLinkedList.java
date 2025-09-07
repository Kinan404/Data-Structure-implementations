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

class CRlinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        tail.next = head;
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            tail.next = newNode;
        } else {

            tail.next = newNode;

            tail = newNode;
            tail.next = head;
            size++;
        }
    }

    public void insertAfter(T data, T search) {
        Node<T> newNode = new Node<T>(data);
        Node<T> temp = head;
        while (temp != null && !temp.data.equals(search)) {
            temp = temp.next;
            if (head == temp) {
                break;
            }
        }
        if (temp != null && temp.data.equals(search)) {
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == tail) {
                tail = newNode;
                tail.next = head;
                size++;
            } else {
                System.out.println("Data not found error!");
            }
        }
    }

    public boolean remove(T data) {
        if (head == null) {
            System.out.println("List is empty !");
            return false;
        }
        Node<T> temp = head;
        while (temp != null && !temp.next.data.equals(data)) {
            temp = temp.next;
            if (temp == head) {
                break;
            }
        }
        if (temp.next.data.equals(data)) {
            temp.next = temp.next.next;
            size--;
            return true;
        }
        return false;
    }

    public void print() {
        Node<T> temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }  

    public int size() {
        return size;
    }

}

public class CLinkedList {

    public static void main(String[] args) {

        
   CRlinkedList<Integer> list = new CRlinkedList<Integer>();
   list.addFirst(10);
   list.addLast(20);
   list.addLast(30);
   list.addLast(40);
   list.remove(20);
   list.print();
    }
}
