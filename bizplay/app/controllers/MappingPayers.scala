package controllers

import models.MappingPayer
import play.api.libs.json.Json
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
import play.api.Play.current
import play.api.mvc._
import play.api.libs.json._

object MappingPayers extends Controller {

  def list = Action {
    DB.withSession { implicit session =>
      Ok(Json.toJson(MappingPayer.all().list.map(mp =>
        MappingPayer(mp._1, mp._2, mp._3, mp._4, mp._5, mp._6))))
    }
  }

  // http://www.playframework.com/documentation/2.1.1/ScalaJsonRequests
  def update = Action(parse.json) { request =>
    request.body.validate[MappingPayer].map{
      case MappingPayer(clearinghousePayerID, eligibleApiPayerNumber, eligibleApiPayerName, active, payerNumber, payerName) =>
        Ok(clearinghousePayerID.toString())
    }.recoverTotal{
      e => BadRequest("Detected error:" + JsError.toFlatJson(e))
    }
  }
}