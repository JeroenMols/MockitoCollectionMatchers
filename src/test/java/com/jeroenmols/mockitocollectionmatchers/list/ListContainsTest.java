package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.ArrayList;

import static com.jeroenmols.mockitocollectionmatchers.list.testhelpers.CollectionHelpers.createListWithObjects;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListContainsTest {

    private Object expectedObject = new Object();
    private Object expectedObject2 = new Object();

    @Test
    public void listWithSingleObject() throws Exception {
        ArrayList<Object> list = createListWithObjects(expectedObject);

        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.matches(list)).isTrue();
    }

    @Test
    public void listDoesntContainObject() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object());

        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.matches(list)).isFalse();
    }

    @Test
    public void listWithMultipleObjects() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object(), expectedObject);

        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.matches(list)).isTrue();
    }

    @Test
    public void listContainsMultipleObjects() throws Exception {
        ArrayList<Object> list = createListWithObjects(expectedObject, expectedObject2);

        ListContains<Object> listContains = new ListContains<Object>(expectedObject, expectedObject2);

        assertThat(listContains.matches(list)).isTrue();
    }

    @Test
    public void listDoenstContainAllObjects() throws Exception {
        ArrayList<Object> list = createListWithObjects(expectedObject, new Object());

        ListContains<Object> listContains = new ListContains<Object>(expectedObject, expectedObject2);

        assertThat(listContains.matches(list)).isFalse();
    }

    @Test
    public void errorMessageContainsObject() throws Exception {
        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.toString()).contains(expectedObject.toString());
    }

    @Test
    public void errorMessageContainsMultipleObjects() throws Exception {
        ListContains<Object> listContains = new ListContains<Object>(expectedObject, expectedObject2);

        assertThat(listContains.toString()).contains("all objects");
    }
}