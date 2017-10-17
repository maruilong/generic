package com.shinian.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/16 10:03
 */
public class New {
    private static final int SIZE = 5;

    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>(SIZE);
    }

    public static <T> List<T> list() {
        return new ArrayList<T>(SIZE);
    }

    public static <T> List<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>(SIZE);
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }


    public static void main(String[] args) {
        Queue<Object> queue = New.queue();
        System.out.println(queue);

    }


}
