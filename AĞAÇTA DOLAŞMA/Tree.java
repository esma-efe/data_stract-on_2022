
public class Tree {

    Node root;

    public Tree() {
        root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);

        }

        else
            root = newNode(data);
        return root;
    }

    void preOrder(Node root) // köke başta uğra
    {
        if (root != null) {
            System.out.println(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) // köke ortada uğra
    {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + "  ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) // köke en son uğra
    {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + "  ");
        }
    }

    int height(Node root) // yükseklik bulma
    {
        if (root == null)
            return 0; // kök varsa sıfır döndürür return 0 yazsaydın 1 döndürürdü.
        else {
            int sol = 0, sag = 0;

            sol = height(root.left);
            sag = height(root.right);
            if (sol > sag)
                return sol + 1;
            else
                return sag + 1;
        }
    }

    int size(Node root) // eleman sayısını bulma
    {
        if (root == null)
            return 0;
        else {
            return size(root.left) + 1 + size(root.right);
        }
    }

}