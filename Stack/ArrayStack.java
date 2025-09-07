/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.Stack;

class Stack<T> {

    private T dataArray[];
    private int top;

    public Stack(int capacity) {
        dataArray = (T[]) new Object[capacity];
        top = -1;
    }

    void push(T data) {
        if (ifFull()) {
            System.out.println("Stack is full !");
        } else {
            top++;
            dataArray[top] = data;
        }
    }

    T pop() {
        if (ifEmpty()) {
            System.out.println("Stack is empty !");
            return null;
        } else {
            return dataArray[top--];
        }

    }

    T peek() {
        if (ifEmpty()) {
            System.out.println("Stack is empty !");
            return null;
        } else {
            return dataArray[top];
        }
    }

    private boolean ifFull() {
        return top + 1 == dataArray.length;
    }

    private boolean ifEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void print() {
        if (ifEmpty()) {
            System.out.println("Stack is empty !");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(dataArray[i]);
            }
        }
    }

}

public class ArrayStack {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>(5);
        s.push(5);
                s.push(4);
                System.out.println(s.pop());
                System.out.println("THe peek is " + s.peek());
//        s.push(3);
//        s.push(2);
//        s.push(1);
//        s.pop();
//        System.out.println("Peek is " + s.peek());
//        s.print();
//        
        
    }

}
