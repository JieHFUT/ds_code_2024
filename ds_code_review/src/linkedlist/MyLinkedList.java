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
     * 在任意位置插入，第一个 node 节点索引视为 0
     * @param index
     * @param element
     */
    public void addIndex(int index, E element) {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("索引越界，无法添加");
        // 去除特殊情况
        if (first == null) {
            // 此时链表中没有元素，只能插入首个元素
            Node<E> newNode = new Node<>(null, element, null);
            first = newNode;
            last = newNode;
            return;
        }
        Node current = first;
        // 此时链表中有元素, 找到对应 index 位置
        while (index > 0) {
            current = current.next;
            index--;
        }
        if (current == first) {
            // 插在头部
            linkFirst(element);
        }
        if (current == null) {
            // 插在尾部
            linkLast(element);
        }

        // 正常插在某个元素前面
        Node<E> newNode = new Node<E>(current.prev, element, current);
        current.prev.next = newNode;
        current.prev = newNode;
        return;
    }

    /**
     * 查找元素 element 是否包含在链表中
     * @param element
     * @return
     */
    public boolean contains(E element) {
        if (first == null)
            throw new LinkedListIsEmptyException("链表为空异常");
        // 遍历链表 查询对应元素
        Node<E> current = first;
        while (current != null) {
            if (current.item.equals(element))
                return true;
            current = current.next;
        }
        return false;
    }

    /**
     * 删除第一次出现 element 元素的节点
     * @param element
     */
    public void remove(E element) {
        if (first == null)
            throw new LinkedListIsEmptyException("链表为空异常");
        // 遍历链表 查询节点
        Node<E> current = first;
        while (current != null) {
            // 如果要删除第一个节点
            if(first.item.equals(element)) {
                first.next.prev = null;
                first = first.next;
                return;
            }
            // 如果要删除最后一个节点
            if (last.item.equals(element)) {
                last.prev.next = null;
                last = last.prev;
                return;
            }
            if (current.item.equals(element)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return;
            }
            current = current.next;
        }
    }

    /**
     * 删除所有值为 element 的节点
     * @param element
     */
    public void removeAll(E element) {
        if (first == null)
            throw new LinkedListIsEmptyException("链表为空异常");
        // 遍历链表 查询节点
        Node<E> current = first;
        while (current != null) {
            // 如果要删除第一个节点
            if(first.item.equals(element)) {
                first.next.prev = null;
                first = first.next;
            }
            // 如果要删除最后一个节点
            if (last.item.equals(element)) {
                last.prev.next = null;
                last = last.prev;
            }
            if (current.item.equals(element)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            current = current.next;
        }
    }

    /**
     * 得到单链表的长度
     * @return
     */
    public int size() {
        int count = 0;
        Node<E> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * 打印链表
     */
    public void display() {
        Node<E> current = first;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 清空链表
     */
    public void clear() {
        Node<E> current = first;
        while(current != null){
            Node<E> curNext = current.next;
            //current.value = null;
            current.prev = null;
            current.next = null;
            current = curNext;
        }
        this.first = null;
        this.last = null;
    }


}
