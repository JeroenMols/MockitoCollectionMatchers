package com.jeroenmols.mockitocollectionmatchers.list;

import org.mockito.ArgumentMatcher;

import java.util.List;

/**
 * Created by jmols on 10/11/16.
 */
public class ListContainsNull implements ArgumentMatcher<List> {

    public boolean matches(List list) {
        return list.contains(null);
    }

    @Override
    public String toString() {
        return "[list does not contain null]";
    }
}
