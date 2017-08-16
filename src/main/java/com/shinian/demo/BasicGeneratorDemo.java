package com.shinian.demo;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/16 17:32
 */
public class BasicGeneratorDemo {


    public static void main(String[] args) {
        Generator<CountedObject> countedObjectGenerator = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 5; i++) {
            System.out.println(countedObjectGenerator.next());
        }
    }

}
