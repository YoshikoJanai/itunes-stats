import org.w3c.dom.Document
import java.io.File
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory

class ITunesParser {
    //val DocumentBuilder

}

fun main() {
    val builder:DocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    val document:Document = builder.parse(File("src/iTunes Music Library.xml"))

}