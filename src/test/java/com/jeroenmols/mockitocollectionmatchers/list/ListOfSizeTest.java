package com.jeroenmols.mockitocollectionmatchers.list;

import org.junit.Test;

import java.util.ArrayList;

import static com.jeroenmols.mockitocollectionmatchers.list.testhelpers.CollectionHelpers.createListWithObjects;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmols on 10/11/16.
 */
public class ListOfSizeTest {

    @Test
    public void emptyList() throws Exception {
        ArrayList<Object> list = createListWithObjects();
        ListOfSize listOfSize = new ListOfSize(0);

        assertThat(listOfSize.matches(list)).isTrue();
    }

    @Test
    public void listWithSingleObject() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object());
        ListOfSize listOfSize = new ListOfSize(1);

        assertThat(listOfSize.matches(list)).isTrue();
    }

    @Test
    public void errorMessageContainsSizes() throws Exception {
        ArrayList<Object> list = createListWithObjects(new Object());
        ListOfSize listOfSize = new ListOfSize(0);

        listOfSize.matches(list);

        assertThat(listOfSize.toString()).contains("1", "0");
    }
}