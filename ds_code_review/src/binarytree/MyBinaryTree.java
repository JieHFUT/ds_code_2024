package binarytree;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MyBinaryTree
 * Package: binarytree
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 9:28
 * @Version 1.0
 */
public class MyBinaryTree<E> {


    // 树的节点内部类
    class Node<E> {
        E data;
        Node<E> left;
        Node<E> right;

        public Node(E data) {
            this.data = data;
        }
        public Node(Node<E> left, E data, Node<E> right) {
            this.left = left;
            this.data = data;
            this.right = right;
        }


    }

//    public Node<E> root;
//
//    /**
//     * 下面是树的构造方法
//     */
//    public MyBinaryTree() {}
//
//    public MyBinaryTree(Node<E> root) {
//        this.root = root;
//    }

//    /**
//     * 向树中添加元素, 按照比父节点小左边，比父节点大放在右边
//     * @param element
//     */
//    public void addElement(E element) {
//        Node<E> node = new Node<>(element);
//        if (root == null) {
//            // 如果根节点是 null, 新增加的就是根节点
//            root = node;
//            return;
//        }
//        // 根节点不是 null, 向下寻找其子树
//        Node<E> parent = root;
//        while (true) {
//            if (parent.left == null) {
//                parent.left = node;
//            }else if (parent.right == null){
//                parent.right = node;
//            }else {
//
//            }
//        }
//    }

    public Node<Character> createTree() {
        Node<Character> A = new Node<>('A');
        Node<Character> B = new Node<>('B');
        Node<Character> C = new Node<>('C');
        Node<Character> D = new Node<>('D');
        Node<Character> E = new Node<>('E');
        Node<Character> F = new Node<>('F');
        Node<Character> G = new Node<>('G');
        Node<Character> H = new Node<>('H');
        Node<Character> I = new Node<>('I');
        Node<Character> J = new Node<>('J');
        Node<Character> K = new Node<>('K');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        D.left = H;
        D.right = I;
        E.left = J;
        E.right = K;
        return A;
    }


//                   A
//              B         C
//          D      E    F    G
//        H  I   J  K
    /**
     * 前序遍历 根左右
     * ABDHIEJKCFG
     * @param root
     */
    public void preOrder(Node<E> root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        return;
    }

    /**
     * 中序遍历 左根右
     * HDIBJEKAFCG
     * @param root
     */
    public void inOrder(Node<E> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        return;
    }

    /**
     * 后序遍历 左右根
     * HIDJKEBFGCA
     * @param root
     */
    public void postOrder(Node<E> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
        return;
    }


    /**
     * 其他形式的遍历方式
     * @param root
     * @return
     */
    public List<E> otherPreOrder(Node<E> root) {
        List<E> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.data);

        list.addAll(otherPreOrder(root.left));
        list.addAll(otherPreOrder(root.right));
        return list;
    }
    public List<E> otherInOrder(Node<E> root) {
        List<E> list = new ArrayList<>();
        if (root == null) return list;

        list.addAll(otherPreOrder(root.left));
        list.add(root.data);
        list.addAll(otherPreOrder(root.right));
        return list;
    }
    public List<E> otherPostOrder(Node<E> root) {
        List<E> list = new ArrayList<>();
        if (root == null) return list;

        list.addAll(otherPreOrder(root.left));
        list.addAll(otherPreOrder(root.right));
        list.add(root.data);
        return list;
    }

    /**
     * 获取树中节点的个数
     * 但是该方法在一次运行中只能调用一次
     * @param root
     * @return
     */
    private static int numOfNodes = 0;
    public int size(Node<E> root) {
        if (root == null) return 0;
        numOfNodes++;
        size(root.left);
        size(root.right);
        return numOfNodes;
    }

    /**
     * 可以多次使用的获取个数的方法
     * @param root
     * @return
     */
    public int otherSize(Node<E> root) {
        if (root == null) return 0;
        return otherSize(root.left) + otherSize(root.right) + 1;
    }


    /**
     * 获取叶子节点的个数
     * @param root
     * @return
     */
    public int getNumberOfLeaves(Node<E> root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
    }


    /**
     * 获取
     * @param root
     * @param k
     * @return
     */
    public int getKLevelNumberOfNodes(Node<E> root, int k) {

    }



}
