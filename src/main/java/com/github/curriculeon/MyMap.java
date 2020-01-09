package com.github.curriculeon;

import javafx.util.Pair;

import java.security.Key;
import java.util.List;
import java.util.Set;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType>{

    private MyArrayList<KeyValue<KeyType, ValueType>> keyValues;

    public MyMap() {
        this.keyValues = new MyArrayList<>();
//        Pair<String, Integer> p = new Pair<>("Hello", 1);
//        String key = p.getKey();
//        Integer value = p.getValue();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        KeyValue<KeyType, ValueType>[] array = new KeyValue[entries.size()];
        for (int i = 0; i < array.length; i++) {
            KeyValue<KeyType, ValueType> keyTypeValueTypeKeyValue = array[i];
            list.add(keyTypeValueTypeKeyValue);
        }
//        this.keyValues = new MyArrayList<>(entries.toArray(new KeyValue[0]));
    }

    @Override
    public void put(KeyType key, ValueType value) {
        KeyValue<KeyType, ValueType> entry = new KeyValue<>(key, value);
        list.add(entry);
    }

    @Override
    public ValueType get(KeyType key) {
        for (int currentIndex = 0; currentIndex < list.size; currentIndex++) {
             KeyValue<KeyType, ValueType> currentEntry = list.get(currentIndex);
             KeyType currentKey = currentEntry.getKey();
             ValueType currentVal = currentEntry.getValue();

             if(currentKey.equals(key)) {
                 return currentVal;
             }

        }
    }

    @Override
    public Set<KeyType> getKeySet() {
        return null;
    }

    @Override
    public List<ValueType> getValues() {
        return null;
    }

    @Override
    public Set<KeyValue<KeyType, ValueType>> getKeyValues() {
        return null;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null;
    }
}
