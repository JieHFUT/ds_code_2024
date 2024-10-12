package stack;

import java.util.Arrays;

public class MyStack2<E> {

    private E[] elem;
    private int useSize;

    public MyStack2() {
        this.elem = (E[]) new Object[2];
    }

    /**
     * 判断当前栈是否已满
     * @return
     */
    public boolean isFull() {
        return useSize == elem.length;
    }

    /**
     * 入栈
     * @param e
     */
    public void push(E e) {
        if (isFull())
            throw new StackIsFullException("Stack is full");
        elem = Arrays.copyOf(elem, elem.length * 2);
        elem[useSize++] = e;
    }


    /**
     * 判断当前栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return useSize == 0;
    }


    /**
     * 出栈，返回出栈的元素
     * @return
     */
    public E pop() {
        if(isEmpty())
            throw new StackIsEmptyException("Stack is empty");
        E e = elem[--useSize];
        elem[useSize] = null;
        return e;
    }

    /**
     * 获取栈顶元素 不删除
     * @return
     */
    public E peek() {
        if(isEmpty())
            throw new StackIsEmptyException("Stack is empty");
        return elem[useSize-1];
    }

    /**
     * 获取栈的大小
     * @return
     */
    public int getUseSize() {
        return useSize;
    }


}