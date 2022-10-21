package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag <T> implements Container<T> {

    private final List<T> myList = new ArrayList<>();


    public List<T> myList() {
        return myList;
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(T item) {
    }

    @Override
    public Iterator<T> iterator() {
        return myList.iterator();
    }
}