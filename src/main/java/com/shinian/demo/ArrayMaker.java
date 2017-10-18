package com.shinian.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author shinian
 * @date 2017/10/18/018
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker arrayMaker = new ArrayMaker<>(String.class);
        Object[] objects = arrayMaker.create(5);
        System.out.println(Arrays.toString(objects));
    }
}
