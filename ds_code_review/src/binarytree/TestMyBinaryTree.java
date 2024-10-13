package binarytree;

/**
 * ClassName: TestMyBinaryTree
 * Package: binarytree
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 9:37
 * @Version 1.0
 */
public class TestMyBinaryTree {

    public static void main(String[] args) {

        MyBinaryTree tree = new MyBinaryTree();
        MyBinaryTree.Node treeNode = tree.createTree();
        System.out.print("前序遍历: ");tree.preOrder(treeNode);
        System.out.println();
        System.out.print("中序遍历: ");tree.inOrder(treeNode);
        System.out.println();
        System.out.print("后序遍历: ");tree.postOrder(treeNode);
        System.out.println();

        System.out.println("============================");

        System.out.println(tree.size(treeNode));
        System.out.println(tree.size(treeNode));

    }
}
