package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListDoesNotContainAtIndexTest {

    private Object expectedObject = new Object();

    @Test
    public void listDoesNotContainValueAtIndex() throws Exception {
        List<Object> list = Arrays.asList(new Object(), new Object());
        ListDoesNotContainAtIndex<Object> doesNotContainAtIndex = new ListDoesNotContainAtIndex<Object>(expectedObject, 1);

        assertThat(doesNotContainAtIndex.matches(list)).isTrue();
    }

    @Test
    public void listContainsValueAtIndex() throws Exception {
        List<Object> list = Arrays.asList(new Object(), expectedObject);
        ListDoesNotContainAtIndex<Object> doesNotContainAtIndex = new ListDoesNotContainAtIndex<Object>(expectedObject, 1);

        assertThat(doesNotContainAtIndex.matches(list)).isFalse();
    }


    @Test
    public void errorMessageContainsObject() throws Exception {
        ListDoesNotContainAtIndex<Object> doesNotContainAtIndex = new ListDoesNotContainAtIndex<Object>(expectedObject, 1);

        assertThat(doesNotContainAtIndex.toString()).contains(expectedObject.toString());
    }

    @Test
    public void errorMessageContainsIndex() throws Exception {
        ListDoesNotContainAtIndex<Object> doesNotContainAtIndex = new ListDoesNotContainAtIndex<Object>(expectedObject, 1);

        assertThat(doesNotContainAtIndex.toString()).contains("1");
    }
}
