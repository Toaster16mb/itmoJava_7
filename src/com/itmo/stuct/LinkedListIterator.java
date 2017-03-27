package com.itmo.stuct;

import java.util.Iterator;

/**
 * Created by asus on 24.03.17.
 */
public class LinkedListIterator implements Iterator {
    private LinkedList.Item next;
    public LinkedListIterator(LinkedList.Item next) {
        this.next = next;
    }
    @Override
    public Object next() {
        LinkedList.Item curr = next;
        next = next.next;
        return curr.value;
    }

    @Override
    public boolean hasNext() {
        if (next.next == null)
            return false;
        return true;
    }
}
