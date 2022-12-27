public class Node {
    int data;
    Node next; /// bir adet data iki adet göstericisi olan bir yapı oluşturduk
    Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
