package com.shinian.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author shinian
 * @date 2017/10/23/023
 */
public class NeedCasting {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));
        //不同的是这里需要校验
        List<Widget> widgets = (List<Widget>) ois.readObject();
    }
}
