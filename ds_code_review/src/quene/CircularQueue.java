package quene;

public class CircularQueue<E> {

//    public interface Queue<E> extends Collection<E> {
//        boolean add(E e);
//        boolean offer(E e);
//        E remove();
//        E poll();
//        E element();
//        E peek();
//    }
    /**
     * boolean offer(E e) 入队列
     * E poll() 出队列
     * peek() 获取队头元素但是不删除
     * int size() 获取队列中有效元素个数
     * boolean isEmpty() 检测队列是否为空
     */

    // 循环队列
    private E[] elemData;
    private int front;    // 前面的
    private int rear;     // 后面的


    // capacity 表示数组大小
    public CircularQueue(int capacity) {
        elemData =  (E[]) new Object[capacity + 1];
    }


    public boolean isEmpty() {
        return front == rear;
    }
    /**
     *
     * @return
     */
    public boolean isFull() {
        if ((rear + 1) % elemData.length == front) {
            return true;
        }
        return false;
    }


    /**
     * 队尾入队
     * @param element
     * @return
     */
    public boolean inQueue(E element) {
        if (isFull())
            return false;
        elemData[rear] = element;
        rear = (rear + 1) % elemData.length;
        return true;
    }

    /**
     * 队头出队
     * @return
     */
    public E outQueue() {
        if(isEmpty())
            throw new CircularQueueIsEmptyException("Queue is empty");
        E element = elemData[front];
        elemData[front] = null;
        front = (front + 1) % elemData.length;
        return element;
    }


    /**
     * 得到队尾元素
     * @return
     */
    public E GetRear() {
        if (isEmpty())
            throw new CircularQueueIsEmptyException("Queue is empty");
        return elemData[rear];
    }

    /**
     * 得到队头元素
     * @return
     */
    public E GetFront() {
        if(isEmpty())
            throw new CircularQueueIsEmptyException("Queue is empty");
        return elemData[front];
    }
}
