package models

import play.api.libs.json.Json
import scala.slick.driver.SQLServerDriver.simple._
import java.sql.Date

case class EligibilityTransactionLog (
  transactionDate: Date,
  eligibilityTransportID: Int)

object EligibilityTransactionLog extends Table[EligibilityTransactionLog]("EligibilityTransactionLog") {
  implicit val mappingWriter = Json.writes[EligibilityTransactionLog]

  def all() = Query(EligibilityTransactionLog)

  def transactionDate = column[Date]("TransactionDate")
  def eligibilityTransportID = column[Int]("EligibilityTransportID")
  def * = transactionDate ~ eligibilityTransportID <> (EligibilityTransactionLog.apply _, EligibilityTransactionLog.unapply _)
}
