/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// "Bind Constructor Parameters to Fields" "true"

class Bar {

    private final int myI1;
    private final int myI2;
    private final String myI3;
    private int myi1;
    private int myi2;

    Bar(int i1, int i2, String i3) {
        myI1 = i1;
        myI2 = i2;
        myI3 = i3;
    }
}