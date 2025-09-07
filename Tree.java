package Tree;

public class Tree {

}

class koni {

    int x;

    public koni(int dk) {
        this.x = dk;
    }

    public void cal(koni k) {
        k.x = 20;
    }
}

class Node<T extends Comparable<T>> {

    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this.value = value;
    }
}

class TreeBST<T extends Comparable<T>> {

    Node<T> root;

    public TreeBST() {
        root = null;
    }

    public Node<T> insert(T value, Node<T> r) {
        if (r == null) {
            Node<T> newNode = new Node<>(value);
            r = newNode;
        } else if (value.compareTo(r.value) < 0) {
            r.left = insert(value, r.left); // assign to left subtree == 8
        } else {
            r.right = insert(value, r.right); // assign to right subtree
        }
        return r; // return updated root
    }

    public void insert(T element) {
        root = insert(element, root);
    }

    public Node<T> search(Node<T> r, T value) {
        if (r == null) {
            System.out.println("The element is not exict");
            return null;
        } else if (value.equals(r.value)) {
            return r;
        }
        else if (value.compareTo(r.value) > 0) {
            search(r.right, value);
        }
        else {
            search(r.left, value);
        }
        return null;
    }  
    public boolean search(T value) {
        Node<T> n = new Node<>(value);
        n = search(root, value);
        if(n == null) {
            System.out.println("No found");
            return false;
        } 
        System.out.println("Yes found");
        return true;
    }
    public Node<T> min(Node r) {
        if(r== null) {
            return null;
        } else if(r.left == null) {
            return root;
        } else {
            min(r.left);
        }
        return root;
    }
    public Node<T> max(Node r) {
        if(r== null) {
            return null;
        } else if(r.right == null) {
            return root;
        } else {
            min(r.right);
        }
        return root;
    }    
    
    
    public void preorder(Node<T> r) { // root left right
        if (r == null) {
            return;
        }
        System.out.print(r.value + "\t");
        preorder(r.left); //  
        preorder(r.right); // 
    }

    public void inorder(Node<T> r) { //  left root right
        if (r == null) {
            return;
        }
        inorder(r.left);
        System.out.print(r.value + "\t");
        inorder(r.right);
    }

    public void postorder(Node<T> r) { //  left  right root
        if (r == null) {
            return;
        }
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.value + "\t");

    }

    public static void main(String[] args) {

        TreeBST<Integer> tree = new TreeBST<>();
        tree.insert(15);
        tree.insert(8);
        tree.insert(100);
        System.out.println(tree.search(100));
        
        
//        tree.insert(6);
//        tree.insert(88);
//        tree.insert(567);
//        System.out.println("Preorder : ");
//        tree.preorder(tree.root);
//        System.out.println("Postorder : ");
//        tree.postorder(tree.root);
//        System.out.println("Inorder : ");
//        tree.inorder(tree.root);
//        System.out.println("The root value now :" + tree.root.value);

    }
}
