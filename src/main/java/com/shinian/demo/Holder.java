package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/19/019
 * 一个持有者
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return value.equals(o);
    }

    public static void main(String[] args) {
        Holder<Apple> holder = new Holder<>(new Apple());
        Apple apple = holder.getValue();
        holder.setValue(apple);

//        Holder<Fruit> fruitHolder=apple;
        Holder<? extends Fruit> fruitHolder = holder;
        Fruit p = fruitHolder.getValue();

        apple = (Apple) fruitHolder.getValue();

        System.out.println(p.equals(apple));
    }
}
