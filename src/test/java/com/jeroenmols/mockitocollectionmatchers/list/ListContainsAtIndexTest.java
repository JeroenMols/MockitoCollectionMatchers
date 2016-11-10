package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.ArrayList;

import static com.jeroenmols.mockitocollectionmatchers.list.testhelpers.CollectionHelpers.createListWithObjects;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListContainsAtIndexTest {

    private Object expectedObject = new Object();

    @Test
    public void listContainsValueAtIndex() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object(), expectedObject);
        ListContainsAtIndex<Object> containsAtIndex = new ListContainsAtIndex<Object>(expectedObject, 1);

        assertThat(containsAtIndex.matches(list)).isTrue();
    }

    @Test
    public void listDoesntContainValueAtIndex() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object(), new Object());
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