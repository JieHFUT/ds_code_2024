package linkedlist;

import javax.net.ssl.SSLContext;
import java.util.Collection;

/**
 * ClassName: MyLinkedList
 * Package: linkedlist
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/10 21:08
 * @Version 1.0
 */
public class MyLinkedList<E> {

    // 内部类 Node
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }


    // 属性
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    // 构造方法
    public MyLinkedList() {
    }
    public MyLinkedList(Collection<? extends E> c) {
        this();
        // addAll(c);
    }

    // 头插法
    public void linkFirst(E element) {
        Node<E> f = first;
        Node<E> newNode = new Node<E>(null, element, f);
        first = newNode;
        // 如果此时插入的是第一个元素
        if(last == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
    }
    // 尾插法
    public void linkLast(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(l, element, null);
        last = newNode;
        // 如果此时插入的是第一个元素
        if(first == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    /**
     * 在一个非空节点前面插入一个元素
     * @param element
     * @param node 非空节点
     */
    public void linkBefore(E element, Node<E> node) {
        // 此前已经知道 node != null
        Node<E> prev = node.prev;
        Node<E> newNode = new Node<E>(node.prev, element, node);
        node.prev = newNode;
        if(prev != null)
            prev.next = newNode;
        else
            first = newNode;
        size++;
    }

    /**
     * 在任意位置插入，第一个 node 节点索引视为 1
     * @param index
     * @param element
     */
    public void addIndex(int index, E element) {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        // 去除特殊情况

    }

}
