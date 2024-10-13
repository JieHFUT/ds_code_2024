package quene;

/**
 * ClassName: LinkedQueue
 * Package: quene
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 8:26
 * @Version 1.0
 */
public class LinkedQueue<E> {

    // 节点类
    class Node {
        E data;
        Node next;
        public Node(E data) {
            this.data = data;
        }
    }


    public Node head;
    public Node tail;
    public int size;

    /**
     * 链表队列中 元素由队头指向队尾，队尾入队，队头出队
     */



    /**
     * 入队列
     * @param element
     */
    public void offer(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * 出队列
     * @return
     */
    public E pop() {
        if (head == null)
            throw new LinkedQueueIsEmptyException("Queue is empty");
        E element = head.data;
        head = head.next;
        size--;
        return element;
    }


    /**
     * 显示队列首位但是不删除
     * @return
     */
    public E peek() {
        if (head == null)
            throw new LinkedQueueIsEmptyException("Queue is empty");
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }


}
