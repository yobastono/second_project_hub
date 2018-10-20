package main;

import java.util.function.BiFunction;

public class Calculator {

    public String calc(BiFunction<Integer, Integer, String> bi, int i1, int i2){
        return bi.apply(i1, i2);
    }
}

