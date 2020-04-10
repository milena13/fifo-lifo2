package com.milena;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class QueueExerciseTest {

    private QueueExercise q;

    @Test
    public void arrayLengthShouldBeEqualToTestValue() {
        q = new QueueExercise(0);
        q.add(50);
        q.add(20);
        q.add(70);
        assertThat(q.getArray().length, is(3));
    }

    @Test
    public void elementAddedAtFirstIndexShouldBeEqualToTestValue() {
        q = new QueueExercise(0);
        q.add(50);
        q.add(20);
        q.add(70);
        assertThat(q.getArray()[0], is(70));
    }

    @Test
    public void testArrayLengthBeforeAndAfterElementRemoval() {
        q = new QueueExercise(0);
        q.add(50);
        q.add(20);
        q.add(70);
        assertThat(q.getArray().length, is(3));
        q.remove();
        assertThat(q.getArray().length, is(2));
        assertThat(q.getArray()[q.getArray().length - 1], is(20));

    }

}