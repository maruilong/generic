package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class GovarianArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        //ArrayStoreException
        fruits[0] = new Fruit();
        //ArrayStoreException
        fruits[0] = new Orange();
    }
}

class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}
