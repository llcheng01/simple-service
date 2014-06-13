package models

import play.api.libs.json.Json
import scala.slick.driver.SQLServerDriver.simple._

case class MappingPayer(
  clearinghousePayerID: Int,
  eligibleApiPayerNumber: String,
  eligibleApiPayerName: String,
  active: Boolean,
  payerNumber: String,
  payerName: String)

object MappingPayer {
  implicit val mappingWriter = Json.writes[MappingPayer]
  implicit val mappingReader = Json.reads[MappingPayer]

  def all() = for {
    (m, p) <- Mapping innerJoin Payer on (_.clearinghousePayerID === _.clearinghousePayerID)
  } yield (m.clearinghousePayerID, m.eligibleApiPayerNumber, m.eligibleApiPayerName, m.active, p.payerNumber, p.payerName)
}
