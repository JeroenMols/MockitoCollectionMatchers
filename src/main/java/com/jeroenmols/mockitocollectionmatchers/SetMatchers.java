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

import com.jeroenmols.mockitocollectionmatchers.set.SetContains;

import java.util.Set;

import static org.mockito.ArgumentMatchers.argThat;

/**
 * @author Jeroen Mols on 11/09/16.
 */

public class SetMatchers {

    public static <K> Set setContains(K object) {
        return argThat(new SetContains<K>(object));
    }

}
