/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
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

package com.facebook.buck.jvm.java.stepsbuilder.javacd;

import com.facebook.buck.cd.model.java.BaseCommandParams.SpoolMode;
import com.facebook.buck.jvm.java.DaemonJavacToJarStepFactory;
import com.facebook.buck.jvm.java.stepsbuilder.AbiStepsBuilder;
import com.facebook.buck.jvm.java.stepsbuilder.JavaCompileStepsBuilder;
import com.facebook.buck.jvm.java.stepsbuilder.JavaCompileStepsBuilderFactory;
import com.facebook.buck.jvm.java.stepsbuilder.LibraryStepsBuilder;
import com.facebook.buck.jvm.java.stepsbuilder.params.JavaCDParams;

/**
 * Factory that creates {@link JavaCompileStepsBuilder } builders instances applicable to JavaCD.
 */
public class JavaCDStepsBuilderFactory implements JavaCompileStepsBuilderFactory {

  private final boolean hasAnnotationProcessing;
  private final SpoolMode spoolMode;
  private final boolean withDownwardApi;
  private final JavaCDParams javaCDParams;

  public JavaCDStepsBuilderFactory(
      DaemonJavacToJarStepFactory configuredCompiler, JavaCDParams javaCDParams) {
    this.hasAnnotationProcessing = configuredCompiler.hasAnnotationProcessing();
    this.spoolMode = configuredCompiler.getSpoolMode();
    this.withDownwardApi = configuredCompiler.isWithDownwardApi();
    this.javaCDParams = javaCDParams;
  }

  /** Creates an appropriate {@link LibraryStepsBuilder} instance. */
  @Override
  public LibraryStepsBuilder getLibraryBuilder() {
    return new JavaCDLibraryStepsBuilder(
        hasAnnotationProcessing, spoolMode, withDownwardApi, javaCDParams);
  }

  /** Creates an appropriate {@link AbiStepsBuilder} instance. */
  @Override
  public AbiStepsBuilder getAbiBuilder() {
    return new JavaCDAbiStepsBuilder(
        hasAnnotationProcessing, spoolMode, withDownwardApi, javaCDParams);
  }
}
