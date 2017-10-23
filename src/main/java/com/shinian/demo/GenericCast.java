package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/23/023
 */
public class GenericCast {
}

class FixedSizeStack<T> {
    private int index = 0;

    /**
     * 不需要转型 ,因为会默认的擦除成为Object类型
     */
    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    /**
     * 相应的也不需要检查
     * @return
     */
    @SuppressWarnings("uncheched")
    public T pop() {
        return (T) storage[--index];
    }


    private static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> stringFixedSizeStack = new FixedSizeStack<>(SIZE);
        for (String s : "A b c d e f g i f".split(" ")) {
            stringFixedSizeStack.push(s);
        }

        for (int i = 0; i < SIZE; i++) {
            String pop = stringFixedSizeStack.pop();
            System.out.println(pop);
        }

    }

}