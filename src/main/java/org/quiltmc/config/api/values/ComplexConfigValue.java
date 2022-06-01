/*
 * Copyright 2022 QuiltMC
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
package org.quiltmc.config.api.values;

import org.quiltmc.config.api.TrackedValue;

/**
 * Some config value that may need to be aware that it's being tracked
 */
public interface ComplexConfigValue {
	/**
	 * @param value the config value that is tracking this value
	 */
	void setValue(TrackedValue<?> value);

	/**
	 * @return a copy of this value if any of its fields are mutable, otherwise can return itself
	 */
	ComplexConfigValue copy();
}