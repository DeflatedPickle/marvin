/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.builder;

import java.io.IOException;

public interface Builder<T> {
  @SuppressWarnings("unused")
  T build() throws IOException;

  interface Node<T> {
    T get();
  }
}
