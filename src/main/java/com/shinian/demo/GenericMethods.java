package com.shinian.demo;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/15 17:37
 */
public class GenericMethods {
    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }


    public static void main(String[] args) {
        GenericMethods genericMethods=new GenericMethods();

        genericMethods.f("");
        genericMethods.f(0);
        genericMethods.f(0.1f);
        genericMethods.f(true);
        genericMethods.f(genericMethods);

    }
}
