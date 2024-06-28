package de.mava.stages.compress

import Compress

class Bzip2 : Compress {
    override fun compress() {
        println("Compressing with Bzip2")
    }

    override fun decompress() {
        println("Decompressing with Bzip2")
    }
}