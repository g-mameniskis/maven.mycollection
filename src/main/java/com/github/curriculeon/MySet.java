package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType> implements MyCollectionInterface {
    private MyCollectionInterface<SomeType> list;

    public MySet() {
        this.list = new MyArrayList<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        this.list = new MyArrayList<>();
    }


    @Override
    public void add(Object objectToAdd) {
        this.list.add(objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        this.list.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        this.list.remove(indexOfObjectToRemove);
    }

    @Override
    public Object get(int indexOfElement) {
        return null;
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return null;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
