package com.shinian.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> first = new ArrayList<Apple>();

//        first.add(new Apple());
        first.add(null);
    }
}
