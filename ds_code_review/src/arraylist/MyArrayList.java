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

        }
    }

    //

    //

    //

    //

    //

    //

    //

    //

    //


















}
