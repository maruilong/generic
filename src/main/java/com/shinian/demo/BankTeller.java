package com.shinian.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BankTeller {

    public static void serve(Teller teller, Customer customer) {
        System.out.println(teller + " server " + customer);
    }


    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);//生成15个弄个类 注入到某个集合里面 相当于初始化15个客户 按照顺序
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator(), 4); //生成四个出纳 不安顺序

        for (Customer customer : line) {
            serve(tellers.get(random.nextInt(tellers.size())), customer);
        }


    }


}


/**
 * 这个类用来生成客户
 */
class Customer { //客户


    private static long counter = 1;

    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }

    /**
     * 每次调用 生成一个客户的生成器
     *
     * @return
     */
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {  //出纳员

    private static long counter = 1;

    private final long id = counter++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller{" +
                "id=" + id +
                '}';
    }

    /**
     * 每次调用 生成一个客户的生成器
     *
     * @return
     */
    public static Generator<Teller> generator() {
        return new Generator<Teller>() {
            public Teller next() {
                return new Teller();
            }
        };
    }
}