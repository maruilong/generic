package com.shinian.demo;

import java.util.Iterator;

/**
 * @author shinian
 * @version V1.0
 * @Title: ${FILE_NAME}
 * @Package com.shinian.demo
 * @Description: TODO
 * @date 2017/8/15 16:59
 */
public class IterableFibonacc extends  Fibonacci implements Iterable<Integer> {
    private int n;

    /**
     * @param count
     */
    public IterableFibonacc(int count) {
        this.n = count;
    }


    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n>0;
            }

            public Integer next() {
                n--;
                return IterableFibonacc.this.next();
            }

            public void remove() {
            throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i:new IterableFibonacc(18)) {
            System.out.println(i+" ");
        }
    }
}
