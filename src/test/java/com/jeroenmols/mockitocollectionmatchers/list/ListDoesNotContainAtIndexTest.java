package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.ArrayList;

import static com.jeroenmols.mockitocollectionmatchers.list.testhelpers.CollectionHelpers.createListWithObjects;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListDoesNotContainAtIndexTest {

    private Object expectedObject = new Object();

    @Test
    public void listDoenstContainValueAtIndex() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object(), new Object());
        ListDoesNotContainAtIndex<Object> doesNotContainAtIndex = new ListDoesNotContainAtIndex<Object>(expectedObject, 1);

        assertThat(doesNotContainAtIndex.matches(list)).isTrue();
    }

    @Test
    public void listContainsValueAtIndex() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object(), expectedObject);
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