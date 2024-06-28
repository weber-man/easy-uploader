import aws.sdk.kotlin.runtime.auth.credentials.StaticCredentialsProvider
import aws.sdk.kotlin.services.s3.*
import aws.sdk.kotlin.services.s3.model.BucketLocationConstraint
import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.net.url.Url
import kotlinx.coroutines.runBlocking
import java.io.File
class S3 : Load {
    private val REGION = "WEUR"
    private val BUCKET = "easy-uploader2"
    private val KEY = "key.png"
    private val client = setupS3Client()

    fun setupS3Client() : S3Client {
        return runBlocking {
            S3Client.fromEnvironment {
                region = REGION
                endpointUrl = Url.parse("https://4231bfdb6d360634622abc748cfb93f4.r2.cloudflarestorage.com")
                credentialsProvider = StaticCredentialsProvider {
                    accessKeyId = ""
                    secretAccessKey = ""
                    region = REGION
                }
            }
        }
    }

    override fun upload() {
        client.use { s3 ->
            println("Creating object $BUCKET/$KEY...")

            val file = File("PNG-Bild.png")
            val fileBytes = file.readBytes()

            runBlocking {
                s3.putObject {
                bucket = BUCKET
                key = file.name
                body = ByteStream.fromBytes(fileBytes)
                }
            }

            println("Object $BUCKET/$KEY created successfully!")
        }
    }
    override fun download() {
        println("Reading from S3")
    }
}