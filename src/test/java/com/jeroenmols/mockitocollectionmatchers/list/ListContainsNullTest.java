package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListContainsNullTest {

    @Test
    public void listContainsNull() throws Exception {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(null);

        assertThat(new ListContainsNull().matches(list)).isTrue();
    }

    @Test
    public void listDoesNotContainNull() throws Exception {
        List<Object> list = Arrays.asList(new Object());

        assertThat(new ListContainsNull().matches(list)).isFalse();
    }

    @Test
    public void errorMessageContainsNull() throws Exception {
        assertThat(new ListContainsNull().toString()).contains("null");
    }
}
