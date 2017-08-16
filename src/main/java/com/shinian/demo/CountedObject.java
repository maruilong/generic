package com.shinian.demo;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/16 17:30
 */
public class CountedObject {
    private static long counter=0;

    private final long id=counter++;

    public long id(){
        return  id;
    }

    @Override
    public String toString() {
        return "CountedObject{" +
                "id=" + id +
                '}';
    }
}
