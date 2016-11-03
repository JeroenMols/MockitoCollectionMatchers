/*
 *  Copyright 2016 Jeroen Mols
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.jeroenmols.mockitocollectionmatchers.list;

import org.mockito.ArgumentMatcher;

import java.util.List;

/**
 * @author Jeroen Mols on 11/09/16.
 */
public class ListDoesNotContain<T> implements ArgumentMatcher<List> {

    private final T[] objects;

    public ListDoesNotContain(T... objects) {
        this.objects = objects;
    }

    public boolean matches(List list) {
        for (T object : objects) {
            if (list.contains(object)) return false;
        }
        return true;
    }

    public String toString() {
        //printed in verification errors
        if (objects.length == 1) {
            return "[list does contain object]";
        } else {
            return "[list does contain one or more objects]";
        }
    }
}
