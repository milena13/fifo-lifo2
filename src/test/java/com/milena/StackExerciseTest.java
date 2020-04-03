package com.milena;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StackExerciseTest {

    private StackExercise s;

    @Test
    public void displayStackMessage() {
        System.out.println("Stack JUnit Test");
    }

    @Test
    public void elementCountShouldBeEqualToTestValue() {
        s = new StackExercise(0);
        s.add(2);

        assertThat(s.getElementCount(), is(1));
    }
}