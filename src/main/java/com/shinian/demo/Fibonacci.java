package com.shinian.demo;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/15 10:03
 */
public class Fibonacci implements Generator<Integer> {

    private int count = 0;


    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(fibonacci.next()+" ");
        }
    }

}
