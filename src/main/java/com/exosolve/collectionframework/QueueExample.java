package com.exosolve.collectionframework;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("Hello");
        queue.add("there");
        queue.add("sun");

        System.out.println("initial queue:" + queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("queue after processin" + queue);
        System.out.println(queue.poll());


    }
}
