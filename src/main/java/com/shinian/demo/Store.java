package com.shinian.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 准备 商品对象 可以更改价格 生成随机的商品
 */

class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        private Random random = new Random(47);

        @Override
        public Product next() {
            return new Product(random.nextInt(1000), "Test", Math.round(random.nextDouble() * 10000.0) + 0.99);
        }
    };

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

/**
 * 一个架子 上面有多个商品
 */
class Shelf extends ArrayList<Product> {

    /**
     * 生成N个商品并且放在当前的架子上面
     */
    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }

}

/**
 * 一个过道
 */
class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelfs, int nProducts) {
        for (int i = 0; i < nShelfs; i++) {
            add(new Shelf(nProducts));
        }
    }
}

/**
 * 收银台
 **/
class CheckoutStand {

}

/**
 * 办公室
 **/
class Office {
}

/**
 * @author shinian
 * @date 2017/10/17
 */
public class Store extends ArrayList<Aisle> {
    private List<CheckoutStand> checkoutStands = new ArrayList<>();

    private List<Office> offices = new ArrayList<Office>();

    public Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle aisle : this) {
            for (Shelf shelf : aisle) {
                for (Product product : shelf) {
                    result.append(product);
                    result.append("\n");
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
