package quene;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: QueueToStack
 * Package: quene
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 8:54
 * @Version 1.0
 */
public class QueueToStack<E> {

    /**
     * 队列实现栈
     * 易知应该使用两个队列
     *
     * void push(int x) 将元素 x 压入栈顶。
     * int pop() 移除并返回栈顶元素。
     * int top() 返回栈顶元素。
     * boolean empty() 如果栈是空的，返回 true ；否则，返回 false
     */

    private Queue<E> queue1;
    private Queue<E> queue2;

    public QueueToStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }


    /**
     * 入栈
     * @param element
     */
    public void push(E element) {

    }


}
