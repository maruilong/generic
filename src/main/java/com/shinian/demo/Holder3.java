package com.shinian.demo;

public class Holder3<T> {
    private T t;


    public static void main(String[] args) {
        Holder3<Automobile> holder3=new Holder3<Automobile>(new Automobile());
        //holder3.setT("dsadsa");

    }




    public Holder3(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
