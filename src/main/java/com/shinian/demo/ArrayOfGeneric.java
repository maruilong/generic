package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;

    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        //no warning
        //gia = (Generic<Integer>[]) new Object[SIZE];  ClassCastException
        System.out.println(gia.getClass().getSimpleName());

        gia[0] = new Generic<Integer>();

        //gia[1]=new Object();  error

    }
}


class Generic<T> {
}