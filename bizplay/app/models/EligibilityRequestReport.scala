package models

import play.api.libs.json.Json
import scala.slick.driver.SQLServerDriver.simple._

case class EligibilityRequestReport(name: String, count: Int)

object EligibilityRequestReport {
  implicit val mappingWriter = Json.writes[EligibilityRequestReport]
  implicit val mappingReader = Json.reads[EligibilityRequestReport]

  def all() = (for {
    (etl, et) <- EligibilityTransactionLog innerJoin EligibilityTransport on (_.eligibilityTransportID === _.eligibilityTransportID)
  } yield (etl, et))
    .groupBy(_._2.transportName)
    .map { case (name, g) => (name, g.length) }
}
