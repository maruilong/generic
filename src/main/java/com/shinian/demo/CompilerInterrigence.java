package com.shinian.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class CompilerInterrigence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());

        Apple apple = (Apple) flist.get(0);

        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
