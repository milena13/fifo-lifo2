package com.milena;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StackExerciseTest {

    private StackExercise s;

    @Test
    public void arrayLengthShouldBeEqualToTestValue() {
        s = new StackExercise(0);
        s.add(50);
        s.add(20);
        s.add(70);
        assertThat(s.getArray().length, is(3));
    }

    @Test
    public void elementAddedAtFirstIndexShouldBeEqualToTestValue() {
        s = new StackExercise(0);
        s.add(50);
        s.add(20);
        s.add(70);
        assertThat(s.getArray()[0], is(50));
    }

    @Test
    public void testArrayLengthBeforeAndAfterElementRemoval() {
        s = new StackExercise(0);
        s.add(50);
        s.add(20);
        s.add(70);
        assertThat(s.getArray().length, is(3));
        s.remove();
        assertThat(s.getArray().length, is(2));
        assertThat(s.getArray()[s.getArray().length - 1], is(20));
    }

}