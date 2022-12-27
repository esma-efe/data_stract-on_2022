public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 4);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 12);

        bst.inOrder(bst.root);

        bst.root = bst.delete(bst.root, 4);
        bst.root = bst.delete(bst.root, 20);
        bst.root = bst.delete(bst.root, 10);
        bst.root = bst.delete(bst.root, 15);
        bst.root = bst.delete(bst.root, 8);
        bst.root = bst.delete(bst.root, 5);
        bst.root = bst.delete(bst.root, 12);

        System.out.println("\nsilme işleminden sonra  ");

        bst.inOrder(bst.root);

        System.out.println("\nkök düğümdeki değer : " + bst.root.data);

    }

}