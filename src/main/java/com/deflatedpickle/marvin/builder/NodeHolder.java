/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.builder;

public interface NodeHolder<I, O extends Builder<I>> {
  O getBuilder();
}
