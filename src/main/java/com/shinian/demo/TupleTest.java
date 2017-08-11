package com.shinian.demo;

public class TupleTest {

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("h1", 47);
    }


    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "h1", 47);
    }


    public static void main(String[] args) {
        TwoTuple<String, Integer> f = f();
        System.out.println(f);
        ThreeTuple<Amphibian, String, Integer> g = g();
        //g.third=12; final会保护public元素,让public元素不被重新赋值
        System.out.println(g);
    }

}


class Amphibian {
}