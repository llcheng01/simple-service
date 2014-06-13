package models

import play.api.libs.json.Json
import scala.slick.driver.SQLServerDriver.simple._

case class EligibilityTransport (
  eligibilityTransportID: Int,
  transportName: String)

object EligibilityTransport extends Table[EligibilityTransport]("EligibilityTransport") {
  implicit val mappingWriter = Json.writes[EligibilityTransport]

  def all() = Query(EligibilityTransport)

  def eligibilityTransportID = column[Int]("EligibilityTransportID", O.PrimaryKey)
  def transportName = column[String]("TransportName")

  def * = eligibilityTransportID ~ transportName <> (EligibilityTransport.apply _, EligibilityTransport.unapply _)
}
