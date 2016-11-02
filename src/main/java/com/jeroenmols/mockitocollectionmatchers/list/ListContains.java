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
public class ListContains<T> implements ArgumentMatcher<List> {

    private final T object;

    public ListContains(T object) {
        this.object = object;
    }

    public boolean matches(List list) {
        return list.contains(object);
    }

    public String toString() {
        //printed in verification errors
        return "[list doesn't contain object]";
    }
}
