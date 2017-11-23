package com.shinian.demo.mix;

/**
 * @author shinian
 * @date 2017/11/23/023
 */
public class Mixins {

    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();

        mixin1.set("test 1");
        mixin2.set("test 2");

        System.out.println(mixin1.get() + "   " + mixin1.getSeriaNumber() + "  " + mixin1.getStamped());
        System.out.println(mixin2.get() + "   " + mixin2.getSeriaNumber() + "  " + mixin2.getStamped());

    }

}

class Mixin extends BasicImp implements TimeStamped, SeriaNumbered {
    private TimeStamped timeStamped = new TimeStampedImp();

    private SeriaNumbered seriaNumbered = new SeriaNumberedImp();

    @Override
    public long getSeriaNumber() {
        return seriaNumbered.getSeriaNumber();
    }

    @Override
    public long getStamped() {
        return timeStamped.getStamped();
    }
}


interface Basic {
    public void set(String val);

    public String get();
}

class BasicImp implements Basic {

    private String value;

    @Override
    public void set(String val) {
        this.value = val;
    }

    @Override
    public String get() {
        return value;
    }
}

interface SeriaNumbered {
    long getSeriaNumber();
}

class SeriaNumberedImp implements SeriaNumbered {

    private static long counter = 1;

    private final long serialNumber = counter++;

    @Override
    public long getSeriaNumber() {
        return serialNumber;
    }
}

class TimeStampedImp implements TimeStamped {
    private final long timeSetmped;

    public TimeStampedImp() {
        this.timeSetmped = System.currentTimeMillis();
    }

    @Override
    public long getStamped() {
        return timeSetmped;
    }
}


interface TimeStamped {
    long getStamped();
}
