/*
 * Copyright 2022-2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.config.oldwrapped;

import org.quiltmc.config.api.WrappedConfig;
import org.quiltmc.config.api.values.ValueMap;

public class TestValueMapConfig extends WrappedConfig {
	public final int version = 100;
	public final String flavor = "lemon";
	public final ValueMap<Integer> weights = ValueMap.builder(0).build();
}