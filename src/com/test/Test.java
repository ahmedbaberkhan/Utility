package com.test;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws MyException {

        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers.forEach(ExceptionConsumer.handlingConsumerWrapper(i -> writeToFile(i)));

    }

    static void writeToFile(Integer integer) throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MyException() {
        super();
    }
}
