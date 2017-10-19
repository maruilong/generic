package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        Foo2<Integer> integerF = new Foo2<>(new IntegerFactory());
    }
}

interface FactoryI<T> {

    T create();
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
