package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListOfSizeTest {

    @Test
    public void emptyList() throws Exception {
        List<Object> list = Collections.emptyList();
        ListOfSize listOfSize = new ListOfSize(0);

        assertThat(listOfSize.matches(list)).isTrue();
    }

    @Test
    public void listWithSingleObject() throws Exception {
        List<Object> list = Arrays.asList(new Object());
        ListOfSize listOfSize = new ListOfSize(1);

        assertThat(listOfSize.matches(list)).isTrue();
    }

    @Test
    public void errorMessageContainsSizes() throws Exception {
        List<Object> list = Arrays.asList(new Object());
        ListOfSize listOfSize = new ListOfSize(0);

        listOfSize.matches(list);

        assertThat(listOfSize.toString()).contains("1", "0");
    }
}
