package com.shinian.demo.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shinian
 * @date 2017/11/21/021
 */
public class ThrowGenericException {

    public static void main(String[] args) {
        ProcessRunner<String, Failure1> runner1 = new ProcessRunner<>();

        for (int i = 0; i < 3; i++) {
            runner1.add(new Processor1());
        }
        try {
            System.out.println(runner1.processAll());
        } catch (Failure1 failure1) {
            failure1.printStackTrace();
        }

        ProcessRunner<Integer, Failure2> runner2 = new ProcessRunner<>();

        for (int i = 0; i < 3; i++) {
            runner2.add(new Processor2());
        }
        try {
            System.out.println(runner2.processAll());
        } catch (Failure2 failure2) {
            failure2.printStackTrace();
        }

    }


}

/**
 * 衰竭?
 */
class Failure1 extends Exception {
}

class Processor1 implements Processor<String, Failure1> {

    static int count = 3;

    @Override
    public void process(List<String> resultController) throws Failure1 {
        if (count-- > 1) {
            resultController.add("Hep!");
        } else {
            resultController.add("Ho!");
        }
        if (count < 0) {
            throw new Failure1();
        }
    }
}

/**
 * 衰竭?
 */
class Failure2 extends Exception {
}

class Processor2 implements Processor<Integer, Failure2> {

    static int count = 3;

    @Override
    public void process(List<Integer> resultController) throws Failure2 {
        if (count-- > 1) {
            resultController.add(1);
        } else {
            resultController.add(2);
        }
        if (count < 0) {
            throw new Failure2();
        }
    }
}

/**
 * 运行者
 *
 * @param <T>
 * @param <E>
 */
class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
    List<T> processAll() throws E {
        List<T> resultController = new ArrayList<>();

        for (Processor<T, E> processor : this) {
            processor.process(resultController);
        }
        return resultController;
    }

}

/**
 * 处理器
 *
 * @param <T>
 * @param <E>
 */
interface Processor<T, E extends Exception> {

    void process(List<T> resultController) throws E;

}



