public class Node {
    int key;
    String isim;
    Node next;

    public Node() {
        next = null;

    }

    public Node(int key, String isim) {
        this.key = key;
        this.isim = isim;
        next = null; // en son eklenenin elemanı her zaman null'u gösterecek

    }
}
