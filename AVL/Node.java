package AVL;

public class Node {
    int data, height;
    Node left, right;

    Node(int value) {
        data = value;
        height = -1;
    }

}