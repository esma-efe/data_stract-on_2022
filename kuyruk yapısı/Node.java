public class Node {
    int data;
    Node next;

    public Node(Node next) {
        this.next = next;
        next = null;

    }
}