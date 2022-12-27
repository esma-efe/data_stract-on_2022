package AVL;

public class AVL {

    Node root;

    int height(Node N) {
        if (N == null)
            return 0;
        else
            return N.height;
    }

    int getBalanceFactor(Node n) {
        if (n == null)
            return 0;
        else
            return height(n.left) - height(n.right);
    }

    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    Node leftRotate(Node a) {
        Node b = a.right;
        Node c = a.left;
        b.left = a;
        a.right = c;
        a.height = max(height(a.left), height(a.right)) + 1;
        b.height = max(height(b.left), height(b.right)) + 1;

        return b;
    }

    Node rightRotate(Node b) {
        Node a = b.left;
        Node c = a.right;
        a.right = b;
        b.left = c;
        b.height = max(height(b.left), height(b.right)) + 1;
        a.height = max(height(a.left), height(a.right)) + 1;
        return a;

    }

    Node insertNode(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (value < node.data)
            node.left = insertNode(node.left, value);
        else if (value > node.data)
            node.right = insertNode(node.right, value);
        else
            return node;

        node.height = max(height(node.left), height(node.right)) + 1;
        int balancefactor = getBalanceFactor(node);
        if (balancefactor > 1)

        // RR
        {
            if (value < node.left.data)
                return rightRotate(node);

            // RL
            else if (value > node.left.data)
                node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balancefactor < -1) {
            // LL
            if (value > node.right.data)
                return leftRotate(node);
            // LR = RR + LL
            else if (value < node.right.data)
                node.right = rightRotate(node.right);
            return leftRotate(node);

        }
        return node;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data + "\t");
            inOrder(node.right);
        }

    }

    public static void main(String[] args) {
        AVL a = new AVL();

        a.root = a.insertNode(a.root, 33);
        a.root = a.insertNode(a.root, 13);
        a.root = a.insertNode(a.root, 53);
        a.root = a.insertNode(a.root, 9);
        a.root = a.insertNode(a.root, 21);
        a.root = a.insertNode(a.root, 61);
        a.root = a.insertNode(a.root, 8);
        a.root = a.insertNode(a.root, 11);

        a.inOrder(a.root);

    }

}