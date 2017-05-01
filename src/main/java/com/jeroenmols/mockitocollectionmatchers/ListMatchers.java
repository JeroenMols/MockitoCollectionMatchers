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

package com.jeroenmols.mockitocollectionmatchers;

import com.jeroenmols.mockitocollectionmatchers.list.*;

import java.util.List;

import static org.mockito.ArgumentMatchers.argThat;

/**
 * @author Jeroen Mols on 11/09/16.
 */

public class ListMatchers {

    public static <K> List<K> listContains(K... object) {
        return argThat(new ListContains<K>(object));
    }

    public static <K> List<K> listContains(K object, int index) {
        return argThat(new ListContainsAtIndex<K>(object, index));
    }

    public static List listContainsNull() {
        return argThat(new ListContainsNull());
    }

    public static <K> List<K> listDoesNotContain(K... object) {
        return argThat(new ListDoesNotContain<K>(object));
    }

    public static <K> List<K> listDoesNotContain(K object, int index) {
        return argThat(new ListDoesNotContainAtIndex<K>(object, index));
    }

    public static List listDoesnotContainNull() {
        return argThat(new ListDoesNotContainNull());
    }

    public static List listOfSize(int size) {
        return argThat(new ListOfSize(size));
    }
}
