class S3 : File {
    override fun write() {
        println("Writing to S3")
    }
    override fun read() {
        println("Reading from S3")
    }
}