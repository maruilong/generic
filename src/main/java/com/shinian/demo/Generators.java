package com.shinian.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: 快速的填充一个Conllection
 * @date 2017/8/16 17:13
 */
public class Generators {

    public static <T>   Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);

        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
    }

}
