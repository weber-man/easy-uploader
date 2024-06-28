interface Compress : Stages {
    fun compress()
}

class hallo : Compress {
    overide fun compress() {
        println("Hallo")
    }
    overide fun register() {
        println("Register")
    }
}