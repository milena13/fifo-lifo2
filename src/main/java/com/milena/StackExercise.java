package com.milena;

import java.util.Arrays;

public class StackExercise implements StackInterface {
    private int[] array;
    private int elementCount;

    public StackExercise(int size) {
//        if (size>0){}
        this.array = new int[size];
        elementCount = 0;
    }

    @Override
    public void displayStackMessage() {

        System.out.println("Stack Interface check");
    }

    @Override
    public void add (int value) {
        int [] dest = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            dest[i] = array[i];
        }
        dest[array.length] = value;
        array = dest;
        elementCount++;
        System.out.println(Arrays.toString(array));
    }

    public void remove () {
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        elementCount--;
        System.out.println(Arrays.toString(array));
    }

    public int getElementCount() {
        return elementCount;
    }
    }
