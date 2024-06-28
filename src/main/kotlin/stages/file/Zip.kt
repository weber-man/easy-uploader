package de.mava.stages.file

import de.mava.stages.FileHandler

class Zip : FileHandler {
    override fun write() {
        println("Writing zip file")
    }

    override fun read() {
        println("Reading zip file")
    }
}