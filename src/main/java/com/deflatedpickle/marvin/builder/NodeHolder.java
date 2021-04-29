package com.deflatedpickle.marvin.builder;

public interface NodeHolder<I, O extends Builder<I> > {
    O getBuilder();
}
