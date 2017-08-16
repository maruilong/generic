package com.shinian.demo;

import java.util.*;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/16 10:03
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K,V>();
    }

    public static <T> List<T> list(){
        return new ArrayList<T>();
    }

    public static <T> List<T> lList(){
        return new LinkedList<T>();
    }

    public static <T> Set<T> set(){
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue(){
        return new LinkedList<T>();
    }


    public static void main(String[] args) {
        Queue<Object> queue = New.queue();
        System.out.println(queue);

    }


}
