package com.shinian.demo;

import java.util.ArrayList;

/**
 * @author shinian
 * @date 2017/10/18/018
 */
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }

}
