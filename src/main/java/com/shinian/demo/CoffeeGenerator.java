package com.shinian.demo;

import java.util.Iterator;
import java.util.Random;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/12 17:38
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};

    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }


    // for iteration;
    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffees=new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffees.next());
        }

        for (Coffee c:new CoffeeGenerator(5) ) {
            System.out.println(c);
        }
    }
}
