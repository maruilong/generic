package com.shinian.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author shinian
 * @date 2017/10/23/023
 */
public class ClassCasting {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));
        //因为擦除的原因无法校验
//        List<Widget> widgets = List<Widget>.class.cast(ois.readObject());
        List<Widget> widgets = List.class.cast(ois.readObject());
    }
}
