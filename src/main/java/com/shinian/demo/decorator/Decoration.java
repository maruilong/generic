package com.shinian.demo.decorator;

/**
 * @author shinian
 * @date 2017/11/23/023
 */
public class Decoration {

    public static void main(String[] args) {
        TimeStamped timeStamped1 = new TimeStamped(new Basic());
        TimeStamped timeStamped2 = new TimeStamped(new SerialNumbered(new Basic()));

        System.out.println(timeStamped1.getTimeStamped());
        System.out.println(timeStamped2.getTimeStamped());

        SerialNumbered serialNumbered1 = new SerialNumbered(new Basic());
        SerialNumbered serialNumbered2 = new SerialNumbered(new TimeStamped(new Basic()));
        System.out.println(serialNumbered1.getSerialNumber());
        System.out.println(serialNumbered2.getSerialNumber());

    }

}

class SerialNumbered extends Decorator {

    private static long counter = 1;

    private final long SerialNumber = counter++;

    public long getSerialNumber() {
        return SerialNumber;
    }

    public SerialNumbered(Basic basic) {
        super(basic);
    }
}

class TimeStamped extends Decorator {

    private final long timeStamped;

    public TimeStamped(Basic basic) {
        super(basic);
        timeStamped = System.currentTimeMillis();
    }

    public long getTimeStamped() {
        return timeStamped;
    }
}

class Decorator extends Basic {

    protected Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    public String get() {
        return basic.getValue();
    }

    public void set(String value) {
        this.basic.setValue(value);
    }
}

class Basic {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}