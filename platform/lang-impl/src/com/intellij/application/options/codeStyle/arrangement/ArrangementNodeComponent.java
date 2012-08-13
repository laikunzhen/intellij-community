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
package com.intellij.application.options.codeStyle.arrangement;

import com.intellij.psi.codeStyle.arrangement.model.ArrangementSettingsNode;
import com.intellij.ui.awt.RelativePoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * // TODO den add doc
 * 
 * @author Denis Zhdanov
 * @since 8/10/12 11:22 AM
 */
public interface ArrangementNodeComponent {
  
  @NotNull
  ArrangementSettingsNode getSettingsNode();
  
  // TODO den add doc
  @NotNull
  JComponent getUiComponent();

  // TODO den add doc
  @Nullable
  ArrangementNodeComponent getComponentAt(@NotNull RelativePoint point);
  
  // TODO den add doc
  @Nullable
  Rectangle getScreenBounds();
  
  void setScreenBounds(@Nullable Rectangle bounds);
}
