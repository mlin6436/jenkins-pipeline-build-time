import java.text.SimpleDateFormat

import scala.xml.XML

object Main extends App {

  private val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")

//  https://<jenkins>/view/<view>/rssLatest

  private val doc = XML.loadFile("src/main/resources/latest.xml")
  private val feed = doc \\ "feed"
  private val entries = feed \\ "entry"

  private val publishedTime = entries.map{
    entry => {
      val dateTimeString = (entry \\ "published").text
      val dateTime = simpleDateFormat.parse(dateTimeString)
      dateTime.getTime
    }
  }

  private val diff = publishedTime.max - publishedTime.min

  println((diff / 1000) / 60 + " min(s) " + ((diff / 1000) % 60) + " sec(s)")
}
