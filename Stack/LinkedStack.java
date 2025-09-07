
package datastructure.Stack;

class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

class Stack<T> {

    private Node<T> head;

    void push(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Srack is empty !");
            return null;
        } else {
            T temp = head.data;
            head = head.next;
            return temp;
        }
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Staic is empty !");
            return null;
        } else {
            return head.data;
        }
    }

    int size() {
        int count = 0;
        if (isEmpty()) {
            return 0;
        } else {
            Node<T> temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        return count;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }

    boolean isEmpty() {
        return head == null;
    }

    void isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        Node temp = stack.head;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (Character) temp.data) {
//                stack.pop(str.charAt(i)); old code was working 
                  stack.pop();
                temp = temp.next;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Yes it's paldinrome");
        } else {
            System.out.println("NO IT's not palindrome");
        }
    }
    
    String BinaryToDecimal(int n) {
       Stack<Integer> s = new Stack<>();
       
       while(n >= 2) {
           int add = n % 2;
           s.push(add);
           
           n /=2;
       }
           s.push(1);
       s.print();
       
       
       
       return " ";
    }
    
//    Sting s = "AB+HJ*";
    
    int postfixToDecimal(String str) {
        Stack<Integer> st = new Stack<>();
        int i =0;
        while(i < str.length()) {
            char s = str.charAt(i);
            if(s == '+' || s == '-' || s == '*' || s == '/') {
                int n1 = st.pop();
                int n2 = st.pop();
                switch(s) {
                    case '+' :
                        st.push(n2 + n1);
                    break;
                    case '-' :
                        st.push(n2 - n1);
                    break;
                    case '*' :
                        st.push(n2 * n1);
                    break;
                    case '/' :
                        st.push(n2 / n1);
                    break;                    
                  
                    default :
                        System.out.println("ERROR");
                }
            } else {
                st.push(str.charAt(i) - 48);
            }
            i++;
        }
        return st.pop();
    }
    

}

public class LinkedStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        
        s.push(3);
        s.push(4);    
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        s.push(5);
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        //        int rest = s.postfixToDecimal("52+3*");
//        System.out.println("REsult is : " + rest);
//        s.push(5)
//        s.push(4);
//        s.push(3);
//        s.push(2);
//        s.push(1);
//
//        s.print();
//        System.out.println(s.peek());
//        System.out.println("Size is " + s.size());
    }
}
