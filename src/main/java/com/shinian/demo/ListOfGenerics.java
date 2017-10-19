package com.shinian.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }

}
