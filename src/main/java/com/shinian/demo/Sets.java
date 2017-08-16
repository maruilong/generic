package com.shinian.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: Set工具
 * @date 2017/8/16 17:37
 */
public class Sets {

    public static <T> Set<T> union(Set<T> a,Set<T> b){
        Set<T> result=new HashSet<T>(a);
        result.addAll(b);
        return result;
    }


}
