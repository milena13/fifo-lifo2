package com.milena;

import java.util.Arrays;

public class Main {

    public static void main(String []args) {

        QueueExercise q = new QueueExercise(0);

        System.out.println("array copy: ");
        //q.createArrayCopy(15050);

        System.out.println("Queue exercise - add method:");
        q.add(5);
        q.add(10);
        System.out.println(Arrays.toString(q.getArray()));
        q.add(15);
        q.add(20);
        q.add(25);
        q.add(30);
        System.out.println(Arrays.toString(q.getArray()));
        System.out.println("Queue array element count: " + q.getElementCount());

        System.out.println("Queue exercise - remove method:");
        q.remove();
        q.remove();
        q.remove();
        System.out.println("Queue array element count: " + q.getElementCount());

        SecondQueue s = new SecondQueue(3);

        System.out.println("Second Queue exercise (double the array length) - add method:");
        s.add(7);
        s.add(9);
        s.add(11);
        s.add(13);

        System.out.println("Second Queue exercise (double the array length) - remove method:");
        s.remove();
        s.remove();
        s.remove();
        System.out.println("Second queue array element count: " + s.getElementCount());

        StackExercise stack = new StackExercise(0);

        stack.add(3);
        stack.add(5);
        stack.add(7);
        stack.add(9);
        System.out.println(Arrays.toString(stack.getArray()));

        System.out.println("Stack array element count: " + stack.getElementCount());
        stack.remove();
        stack.remove();
        stack.remove();
        System.out.println("Stack array element count: " + stack.getElementCount());


    }
}


