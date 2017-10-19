package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/19/019
 */
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> classAsFactory = new ClassAsFactory<>(Employee.class);
        System.out.println("succcess");
        try {
            ClassAsFactory<Integer> integerClassAsFactory = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
}
