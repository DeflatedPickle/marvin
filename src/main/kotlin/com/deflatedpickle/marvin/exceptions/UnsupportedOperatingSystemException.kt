package com.deflatedpickle.marvin.exceptions

class UnsupportedOperatingSystemException(
    operatingSystem: String
) : Exception(
    "$operatingSystem is not supported for the current task"
)