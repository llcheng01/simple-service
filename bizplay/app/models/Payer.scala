package models

import play.api.libs.json.Json
import scala.slick.driver.SQLServerDriver.simple._

case class Payer(
  clearinghousePayerID: Int,
  payerNumber: String,
  payerName: String)

object Payer extends Table[Payer]("ClearinghousePayersList") {
  implicit val mappingWriter = Json.writes[Payer]
  implicit val mappingReader = Json.reads[Payer]

  def all() = Query(Payer)

  def clearinghousePayerID = column[Int]("ClearinghousePayerID", O.PrimaryKey)
  def payerNumber = column[String]("PayerNumber")
  def payerName = column[String]("Name")
  def * = clearinghousePayerID ~ payerNumber ~ payerName <> (Payer.apply _, Payer.unapply _)
}
