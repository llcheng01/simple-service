package controllers

import models.Payer
import play.api.libs.json.Json
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
import play.api.Play.current
import play.api.mvc._
import play.api.libs.json._

object Payers extends Controller {

  def list = Action {
    DB.withSession { implicit session =>
      Ok(Json.toJson(Payer.all().list))
    }
  }

  // http://www.playframework.com/documentation/2.1.1/ScalaJsonRequests
  def update = Action(parse.json) { request =>
    request.body.validate[Payer].map{
      case Payer(clearinghousePayerID, payerNumber, payerName) =>
        Ok(clearinghousePayerID.toString())
    }.recoverTotal{
      e => BadRequest("Detected error:" + JsError.toFlatJson(e))
    }
  }
}