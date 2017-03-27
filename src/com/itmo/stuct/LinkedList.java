package com.itmo.stuct;

import java.util.Iterator;

/**
 * Created by xmitya on 20.03.17.
 */
class LinkedList implements Stack, List {
    private Item head;

    public void push(String val) {
        Item next = head;

        head = new Item(val);

        head.next = next;
    }

    public String poll() {
        return remove(0);
    }

    public void add(String val) {
        if (head == null) {
            head = new Item(val);

            return;
        }

        for (Item prev = head;;) {
            Item next = prev.next;

            if (next == null) {
                prev.next = new Item(val);

                return;
            }

            prev = next;
        }
    }

    public String get(int i) {
        if (head == null)
            return null;

        if (i == 0)
            return head.value;

        int cnt = 1;

        for (Item prev = head;;) {
            Item next = prev.next;

            if (next == null)
                return null;

            if (cnt++ == i)
                return next.value;

            prev = next;
        }
    }

    public String remove(int i) {
        if (head == null)
            return null;

        if (i == 0) {
            Item h = head;

            head = head.next;

            return h.value;
        }

        int cnt = 1;

        for (Item prev = head;;) {
            Item next = prev.next;

            if (next == null)
                return null;

            if (cnt++ == i) {
                if (next.next != null)
                    prev.next = next.next;
                else
                    prev.next = null;

                return next.value;
            }

            prev = next;
        }
    }


    public static class Item {
        public String value;
        Item next;

        public Item(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }
}
