package com.shinian.demo;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/12 17:35
 */
public class Coffee {
    private static long counter = 0;

    private final long id = counter++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "id=" + id + '}';
    }

}

class Latte extends Coffee {

}

class Mocha extends Coffee {

}


class Cappuccino extends Coffee {

}


class Americano extends Coffee {

}

class Breve extends Coffee {

}

