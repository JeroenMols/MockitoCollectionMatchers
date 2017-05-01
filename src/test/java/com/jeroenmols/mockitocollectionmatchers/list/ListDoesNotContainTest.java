package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListDoesNotContainTest {

    private Object expectedObject = new Object();
    private Object expectedObject2 = new Object();

    @Test
    public void listWithSingleObject() throws Exception {
        List<Object> list = Arrays.asList(new Object());

        ListDoesNotContain<Object> listDoesNotContain = new ListDoesNotContain<Object>(expectedObject);

        assertThat(listDoesNotContain.matches(list)).isTrue();
    }

    @Test
    public void listContainsObject() throws Exception {
        List<Object> list = Arrays.asList(expectedObject);

        ListDoesNotContain<Object> listDoesNotContain = new ListDoesNotContain<Object>(expectedObject);

        assertThat(listDoesNotContain.matches(list)).isFalse();
    }

    @Test
    public void listWithMultipleObjects() throws Exception {
        List<Object> list = Arrays.asList(new Object(), expectedObject);

        ListDoesNotContain<Object> listDoesNotContain = new ListDoesNotContain<Object>(expectedObject);

        assertThat(listDoesNotContain.matches(list)).isFalse();
    }

    @Test
    public void listDoesNotContainMultipleObjects() throws Exception {
        List<Object> list = Arrays.asList(new Object());

        ListDoesNotContain<Object> listDoesNotContain = new ListDoesNotContain<Object>(expectedObject,expectedObject2);

        assertThat(listDoesNotContain.matches(list)).isTrue();
    }

    @Test
    public void listContainsOneOfTheObjects() throws Exception {
        List<Object> list = Arrays.asList(expectedObject, new Object());

        ListDoesNotContain<Object> listDoesNotContain = new ListDoesNotContain<Object>(expectedObject,expectedObject2);

        assertThat(listDoesNotContain.matches(list)).isFalse();
    }

    @Test
    public void errorMessageContainsObject() throws Exception {
        ListDoesNotContain<Object> listDoesNotContain = new ListDoesNotContain<Object>(expectedObject);

        assertThat(listDoesNotContain.toString()).contains(expectedObject.toString());
    }

}
