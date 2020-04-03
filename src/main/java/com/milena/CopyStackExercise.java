

import java.util.Arrays;

public class CopyStackExercise {
    private int[] array;
    private int elementCount;

    public CopyStackExercise(int arraySize) {
        this.array = new int[arraySize];
        elementCount = 0;
    }

    public void add (int value) {
        int [] dest = array;

        if (elementCount == array.length) {
            int [] newArray = new int[array.length * 2];
            dest = newArray;
        }

        for (int i = 0; i < array.length; i++) {
            dest[i] = array[i];
        }

        dest[elementCount] = value;
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
