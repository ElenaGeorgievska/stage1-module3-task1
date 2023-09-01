package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    /*public List boxingMethod(String name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }*/

    public <T> List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    /*public <T> List<List<? super T>> boxingMethod(T t) {
        List<? super T> firstList = new ArrayList<>();
        firstList.add(t);
        List<List<? super T>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }*/

    //TODO: Refactor Method-2
    /*public Object genericMethod(Object data) {

        return data;
    }*/

    public  <T> T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    /*public void cloneMethod(List consumer, List producer) {

        consumer.addAll(producer);
    }*/

    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {

        consumer.addAll(producer);
    }

}
