/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.chain2;

import java.util.Map;

/**
 * First builder that allows adding a command in the target chain.
 *
 * @param <K> Context key type
 * @param <V> Context value type
 * @param <C> Type of the context associated with this chain executor
 * @since 2.0
 * @version $Id$
 */
public interface ToExecutorCommandSetter<K, V, C extends Map<K, V>>
    extends CommandSetter<K, V, C, ChainExecutor<K, V, C>> {

}
