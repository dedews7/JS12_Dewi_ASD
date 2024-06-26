public class BinaryTreeMain07 {
    public static void main(String[] args) {
        BinaryTree07 bt = new BinaryTree07();
        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node 5: " + bt.find(5));
        System.out.println("Minimum value in the tree: " + bt.findMin());
        System.out.println("Maximum value in the tree: " + bt.findMax());

        System.out.print("Leaf nodes: ");
        bt.printLeaves();
        System.out.println("");

        System.out.println("Number of leaf nodes: " + bt.countLeaves());

        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}