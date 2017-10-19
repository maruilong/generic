package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/19/019
 */

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.f();
    }
}


class Model {
}

/**
 * 具体子类继承 可以创建一个对象
 */
class Creator extends GenericWithCreate<Model> {

    @Override
    Model create() {
        return new Model();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

/**
 * 定义创建者规则
 *
 * @param <T>
 */
abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}

