package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListContainsAtIndexTest {

    private Object expectedObject = new Object();

    @Test
    public void listContainsValueAtIndex() throws Exception {
        List<Object> list = Arrays.asList(new Object(), expectedObject);
        ListContainsAtIndex<Object> containsAtIndex = new ListContainsAtIndex<Object>(expectedObject, 1);

        assertThat(containsAtIndex.matches(list)).isTrue();
    }

    @Test
    public void listDoesNotContainValueAtIndex() throws Exception {
        List<Object> list = Arrays.asList(new Object(), new Object());
        ListContainsAtIndex<Object> containsAtIndex = new ListContainsAtIndex<Object>(expectedObject, 1);

        assertThat(containsAtIndex.matches(list)).isFalse();
    }

    @Test
    public void errorMessageContainsObject() throws Exception {
        ListContainsAtIndex<Object> containsAtIndex = new ListContainsAtIndex<Object>(expectedObject, 1);

        assertThat(containsAtIndex.toString()).contains(expectedObject.toString());
    }

    @Test
    public void errorMessageContainsIndex() throws Exception {
        ListContainsAtIndex<Object> containsAtIndex = new ListContainsAtIndex<Object>(expectedObject, 1);

        assertThat(containsAtIndex.toString()).contains("1");
    }
}
