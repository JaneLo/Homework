package com.company.Queue;

/**
 * Created by Admin on 13.01.2016.
 */
import java.util.LinkedList;

public class Queue {
    private LinkedList list = new LinkedList();

    public Queue() {
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public void push(Object item) {
        this.list.add(item);
    }

    public Object pop() {
        Object item = this.list.get(0);
        this.list.remove(0);
        return item;
    }

    public Object get(int i) {
        return i < this.list.size()?this.list.get(i):null;
    }
}
