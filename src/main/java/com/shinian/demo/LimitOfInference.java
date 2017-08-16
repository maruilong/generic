package com.shinian.demo;

import java.util.List;
import java.util.Map;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/16 16:58
 */
public class LimitOfInference {

    static void f(Map<String,List<? extends  Integer>> map){}

    public static void main(String[] args) {
        Map<Object, Object> map = New.map();
      //  f(map);  con't compile
        f(New.<String,List<? extends Integer>>map());

    }

}
