/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.builder;

/**
 * A base for creating builder patterns
 *
 * @param <I> The value type
 */
// TODO: Add a function to return a node stack
// TODO: Add a function to push a node to the stack
public interface Builder<I> {
  /**
   * Finishes this builder
   *
   * @return A builder, either this one or a new one
   */
  @SuppressWarnings("unused")
  Builder<I> build();

  /**
   * A node element used for builders
   *
   * @param <T> The type of information
   */
  interface Node<T> {
    /**
     * An instance of type {@link T}
     *
     * @return The information
     */
    T get();
  }
}
