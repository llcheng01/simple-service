package models

import play.api.libs.json.Json
import scala.slick.driver.SQLServerDriver.simple._

case class Mapping(
  clearinghousePayerID: Int,
  eligibleApiPayerNumber: String,
  eligibleApiPayerName: String,
  active: Boolean)

object Mapping extends Table[Mapping]("ClearinghousePayersEligibleApiMap") {
  implicit val mappingWriter = Json.writes[Mapping]
  implicit val mappingReader = Json.reads[Mapping]

  def all() = Query(Mapping)

  def clearinghousePayerID = column[Int]("ClearinghousePayerID", O.PrimaryKey)
  def eligibleApiPayerNumber = column[String]("EligibleApiPayerNumber")
  def eligibleApiPayerName = column[String]("EligibleApiPayerName")
  def active = column[Boolean]("Active")
  def * = clearinghousePayerID ~ eligibleApiPayerNumber ~ eligibleApiPayerName ~ active <> (Mapping.apply _, Mapping.unapply _)
}
