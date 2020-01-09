package com.github.curriculeon;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType>{ // 1). this is the class declaration,
    // I'm saying, "hey, look, I want to create a class to store related methods"
    // for this class, I added a parameter which is a generic type

    private SomeType[] array; // 2). this is the local variable. This declares that a variable can exist

    public MyArrayList() { // 3). this is my constructor. I'm creating an instance of my class
        this.array = (SomeType[]) new Object[0]; // 4). Here I am initializing my instance by saying "hey, I
        // want an object that will be an array of SomeType value with a size of 0"
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) { // 5). I have a second constructor. This one with a parameter
        this.array = valuesToBePopulatedWith; // 6). Here I assign my new array the value of my parameter
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyArrayList listt = new MyArrayList(args);
    }
    @Override
    public void add(SomeType objectToAdd) {
        int newLength = this.array.length+1;
        int lastIndex = newLength-1;
        SomeType[] newArray = Arrays.copyOf(this.array, newLength);
        newArray[lastIndex] = objectToAdd;
        this.array = newArray;

//        Object[] tempArray = new Object[this.array.length+1];
//        for (int i = 0; i < tempArray.length; i++) {
//            SomeType someObject = array[i];
//            tempArray[i] = someObject;
//
//        }
//        tempArray[tempArray.length-1] = objectToAdd;
//        this.array = (SomeType[]) tempArray;
    }

    @Override
    public void remove(SomeType objectToRemove) {
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            SomeType someObject = array[currentIndex];
            if(someObject.equals(objectToRemove)) {
                remove(currentIndex);
                return;
            }
        }
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        SomeType[] leftArray = Arrays.copyOfRange(this.array, 0, indexOfObjectToRemove);
        SomeType[] rightArray = Arrays.copyOfRange(this.array, indexOfObjectToRemove+1, this.array.length);
        SomeType[] tempArray = Arrays.copyOf(leftArray, this.array.length-1);
        for (int rightArrayCurrentIndex = 0; rightArrayCurrentIndex < tempArray.length; rightArrayCurrentIndex++) {
            SomeType someObject = rightArray[rightArrayCurrentIndex];
            int newIndex = indexOfObjectToRemove + rightArrayCurrentIndex - 1;
            tempArray[newIndex] = someObject;
        }
        this.array = tempArray;
    }

    @Override
    public SomeType get(int indexOfElement) {
        return array[indexOfElement];
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        for (int i = 0; i < array.length; i++) {
            SomeType currentObject = array[i];
            if(currentObject.equals(objectToCheckFor)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Integer size() {
        return array.length;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
