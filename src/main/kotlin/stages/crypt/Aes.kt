package de.mava.stages.crypt

import Crypt

class Aes : Crypt {
    override fun encrypt() {
        println("Encrypting with AES")
    }

    override fun decrypt() {
        println("Decrypting with AES")
    }
}