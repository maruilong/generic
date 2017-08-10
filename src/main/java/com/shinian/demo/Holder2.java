package com.shinian.demo;

public class Holder2 {


    public static void main(String[] args) {
        Holder2 holder2=new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.getObject();
        holder2.setObject("not an oejbedfa");
        String s= (String) holder2.getObject();
        holder2.setObject(1);
        Integer integer= (Integer) holder2.getObject();
        System.out.println(holder2);
    }

    private Object object;

    public Holder2(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Holder2{" +
                "object=" + object +
                '}';
    }
}

