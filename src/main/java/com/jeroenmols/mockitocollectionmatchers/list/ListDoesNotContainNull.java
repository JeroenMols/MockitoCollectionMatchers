package com.jeroenmols.mockitocollectionmatchers.list;

import org.mockito.ArgumentMatcher;

import java.util.List;

/**
 * Created by jmols on 10/11/16.
 */
public class ListDoesNotContainNull implements ArgumentMatcher<List> {

    public boolean matches(List list) {
        return !list.contains(null);
    }

    @Override
    public String toString() {
        return "[list does contain null]";
    }
}
