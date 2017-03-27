package com.itmo.stuct;

/**
 * Created by xmitya on 20.03.17.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        for (Object s: list) {
            System.out.println(s);
        }

        System.out.println(list.get(0));

        list.remove(5);

        System.out.println(list.get(5));

        list.remove(8);

        System.out.println(list.get(8));
    }
}
