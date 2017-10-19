package com.shinian.demo;

import java.util.List;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());
    }
}
