package com.jeroenmols.mockitocollectionmatchers.list.testhelpers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jmols on 10/11/16.
 */
public class CollectionHelpers {
    public static ArrayList<Object> createListWithObjects(Object... objects) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.addAll(Arrays.asList(objects));
        return list;
    }
}
