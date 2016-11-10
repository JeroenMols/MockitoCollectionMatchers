package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.ArrayList;

import static com.jeroenmols.mockitocollectionmatchers.list.testhelpers.CollectionHelpers.createListWithObjects;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListDoesNotContainNullTest {

    @Test
    public void listDoesNotContainNull() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object());

        assertThat(new ListDoesNotContainNull().matches(list)).isTrue();
    }

    @Test
    public void listDoesContainNull() throws Exception {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(null);

        assertThat(new ListDoesNotContainNull().matches(list)).isFalse();
    }

    @Test
    public void errorMessageContainsNull() throws Exception {
        assertThat(new ListDoesNotContainNull().toString()).contains("null");
    }
}