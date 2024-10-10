package arraylist;

import java.util.Arrays;

public class MyArrayList<E> {

    // 存储底层数组元素
    private transient Object[] elementData;
    // 记录数组中存储的元素的个数
    private int size;
    //
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;


    /**
     * 下面是 MyArrayList 的空参构造方法，默认构造一个初始容量为 10 的数组
     */
    public MyArrayList() {
        this(10);
    }

    /**
     * 构造用户指定容量的数组
     * @param initialCapacity
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new SelfIllegalAgumentxception("违法的初始容量：" + initialCapacity);
        }
        elementData = new Object[initialCapacity];
    }

    // 打印顺序表
    public void display() {
        for(int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
        System.out.println();
    }

    // 判断数组是不是满的
    public boolean isFull(){
        return size == elementData.length;
    }

    // 新增元素，默认在数组的最后面新增
    public void add(E e) {
        // 1.判断数组是不是满的，如果数组已满则扩容
        if(isFull()) {
            this.elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
        // 添加元素
        elementData[size++] = e;
    }

    // 检测下标是否合法
    private boolean checkIndex(int index) {
        if(index < 0 || index >= size) {
            // 下标位置不合法
            throw new IndexOutOfBoundsException("下标不合法：" + index);
        }
        return true;
    }

    // 在 index 位置新添加元素
    public void add(int index, E e) {
        if(checkIndex(index)) {
            if(isFull()) {
                // 扩容
                this.elementData = Arrays.copyOf(elementData, elementData.length * 2);
            }
            // 移动元素
            for (int i = size - 1; i >= index; i--) {
                elementData[i+1] = elementData[i];
            }
            // 插入数据
            elementData[index] = e;
            size++;
        }
    }

    // 判断是否包含某个元素
    public boolean contains(E e) {
        for(int i = 0; i < size; i++) {
            if(elementData[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    // 查找某一个元素对应的位置，找不到就返回 -1
    public int indexOf(E e) {
        for(int i = 0; i < size; i++) {
            if(elementData[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // 获取 index 位置的元素
    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标不合法！" + index);
        }
        if(isEmpty()) {
            throw new ArrayIsEmptyException("数组为空！" + index);
        }
        return (E) elementData[index];
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 给 index 位置的索引设置为 value
    public boolean set(int index, E e) {
        if(checkIndex(index)) {
            if(isEmpty()) {
                throw new ArrayIsEmptyException("数组为空！" + index);
            }
            elementData[index] = e;
        }
        // 下标不合法
        return false;
    }

    // 删除第一次出现的关键字 key
    public void remove(E e) {
        if(isEmpty()) {
            throw new ArrayIsEmptyException("数组为空！");
        }
        for(int i = 0; i < size; i++) {
            if(elementData[i].equals(e)) {
                // 移动其余元素
                for(int j = i; j < size-1; j++) {
                    elementData[j] = elementData[j+1];
                }
                elementData[--size] = null;
                return;
            }
        }
        throw new DeleteElementNotExistException("要删除的数据不存在！");
    }

    // 获取顺序表长度
    public int size() {
        return size;
    }

    // 清空数据表
    public void clear() {
        for(int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }



















}
