package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListContainsTest {

    private Object expectedObject = new Object();
    private Object expectedObject2 = new Object();

    @Test
    public void listWithSingleObject() throws Exception {
        List<Object> list = Arrays.asList(expectedObject);

        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.matches(list)).isTrue();
    }

    @Test
    public void listDoesNotContainObject() throws Exception {
        List<Object> list = Arrays.asList(new Object());

        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.matches(list)).isFalse();
    }

    @Test
    public void listWithMultipleObjects() throws Exception {
        List<Object> list = Arrays.asList(new Object(), expectedObject);

        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.matches(list)).isTrue();
    }

    @Test
    public void listContainsMultipleObjects() throws Exception {
        List<Object> list = Arrays.asList(expectedObject, expectedObject2);

        ListContains<Object> listContains = new ListContains<Object>(expectedObject,expectedObject2);

        assertThat(listContains.matches(list)).isTrue();
    }

    @Test
    public void listDoesNotContainAllObjects() throws Exception {
        List<Object> list = Arrays.asList(expectedObject, new Object());

        ListContains<Object> listContains = new ListContains<Object>(expectedObject,expectedObject2);

        assertThat(listContains.matches(list)).isFalse();
    }

    @Test
    public void errorMessageContainsObject() throws Exception {
        ListContains<Object> listContains = new ListContains<Object>(expectedObject);

        assertThat(listContains.toString()).contains(expectedObject.toString());
    }
}
