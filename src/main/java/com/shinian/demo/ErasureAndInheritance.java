package com.shinian.demo;

/**
 * @author shinian
 * @date 2017/10/18/018
 */
public class ErasureAndInheritance {

    public static void main(String[] args) {

        Derived2 derived2 = new Derived2();
        Object element = derived2.getElement();
        derived2.setElement(element);

    }
}

class GenericBase<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2 extends GenericBase { // no  warning
}

//class Derived3 extends GenericBase<?> { //error
//}




