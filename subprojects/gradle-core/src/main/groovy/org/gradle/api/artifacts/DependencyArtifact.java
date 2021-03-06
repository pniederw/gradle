/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.artifacts;

/**
 * <p>An {@code Artifact} represents an artifact included in a {@link org.gradle.api.artifacts.Dependency}.</p>
 * An artifact is an (immutable) value object.
 *
 * @author Hans Dockter
 */
public interface DependencyArtifact {
    String DEFAULT_TYPE = "jar";

    /**
     * Returns the name of the dependency artifact.
     */
    String getName();

    /**
     * Returns the type of the dependency artifact. Often the type is the same as the extension,
     * but sometimes this is not the case. For example for an ivy xml module descriptor, the type is
     * <em>ivy</em> and the extension is <em>xml</em>.
     *
     * @see #getExtension() 
     */
    String getType();

    /**
     * Returns the extension of this dependency artifact. Often the extension is the same as the type,
     * but sometimes this is not the case. For example for an ivy xml module descriptor, the type is
     * <em>ivy</em> and the extension is <em>xml</em>.
     *
     * @see #getType() 
     */
    String getExtension();

    /**
     * Returns the classifier of this dependency artifact. 
     */
    String getClassifier();

    /**
     * Returns an URL under which this dependency artifact can be retrieved. If not
     * specified the user repositories are used for retrieving. 
     */
    String getUrl();
}
