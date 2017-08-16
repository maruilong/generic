package com.shinian.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/16 17:03
 */
public class GeneriVarargs {

    public static <T> List<T> makeList(T... args){
        List<T> list=new ArrayList<T>();
        for (T item: args) {
            list.add(item);
        }
        return list;
    }


    public static void main(String[] args) {
        List<String> a = makeList("A");
        System.out.println(a);

    }
}
