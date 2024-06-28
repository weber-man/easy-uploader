package de.mava.stages

import Stage

interface FileHandler : Stage {
    fun write()
    fun read()
}