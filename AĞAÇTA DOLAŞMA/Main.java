public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 12);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 9);
        bst.root = bst.insert(bst.root, 25);

        System.out.print("preOrder  : ");
        bst.preOrder(bst.root);

        System.out.println();

        System.out.println("inorder  : ");
        bst.inOrder(bst.root);

        System.out.println();

        System.out.println("postorder  : ");
        bst.postOrder(bst.root);

        System.out.println("\n\nağacın yüksekliği : " + bst.height(bst.root));
        System.out.println("\nağaç üzerindeki eleman sayısı : " + bst.size(bst.root));

        // System.out.println("kök : " + bst.root.data); eskiden böyle yapardık:
        // System.out.println("kökün solu : " + bst.root.left. data);
        // System.out.println("kökün sağı : " + bst.root.right.data);
        // System.out.println("kökün solunun solu : " + bst.root.left.left.data);
        // System.out.println("kökün sağının solu : " + bst.root.rigt.left.data);
        // System.out.println("kökün solunun sağı : " + bst.root.left.rigt.data);
    }
}