package com.shinian.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author shinian
 * @date 2017/10/23/023
 * 安全检查
 */
public class CheckedList {
    static void oldStyleMethod(List dogs) {
        dogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        oldStyleMethod(dogs1);

        //校验
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
        oldStyleMethod(dogs2);
    }

}

class Dog {
}

class Cat {
}
