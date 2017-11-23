package com.shinian.demo.decorator;

/**
 * @author shinian
 * @date 2017/11/23/023
 */
public class CofferTest {

    public static void main(String[] args) {
        Coffer coffer = new CofferImp();

        SugerCoffer sugerCoffer = new SugerCoffer(coffer);

        sugerCoffer.drink();

        MilkCoffer milkCoffer = new MilkCoffer(coffer);

        milkCoffer.drink();

    }

}

class SugerCoffer extends CofferDecorator {
    public SugerCoffer(Coffer coffer) {
        super(coffer);
    }

    @Override
    public void drink() {
        System.out.println("放糖");
        super.drink();
    }
}

class MilkCoffer extends CofferDecorator {
    public MilkCoffer(Coffer coffer) {
        super(coffer);
    }

    @Override
    public void drink() {
        System.out.println("放牛奶");
        super.drink();
    }
}

abstract class CofferDecorator implements Coffer {
    /**
     * 持有对象
     */
    private Coffer coffer;

    @Override
    public void drink() {

        coffer.drink();
    }


    public CofferDecorator(Coffer coffer) {
        this.coffer = coffer;
    }


}

class CofferImp implements Coffer {

    @Override
    public void drink() {
        System.out.println("Drink coffer");
    }

}


interface Coffer {

    public void drink();

}