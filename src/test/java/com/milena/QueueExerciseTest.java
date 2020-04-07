package com.milena;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class QueueExerciseTest {

    private QueueExercise q;

    @Test
    public void displayQueueMessage() {
        System.out.println("Queue JUnit Test");
    }

    @Test
    public void elementCountShouldBeEqualToTestValue() {
        q = new QueueExercise(0);
        q.add(50);
        q.add(20);
        q.add(70);
        assertThat(q.getElementCount(), is(3));
    }


}