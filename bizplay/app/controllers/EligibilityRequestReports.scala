package controllers

import models.EligibilityRequestReport
import play.api.libs.json.Json
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.DB
import play.api.Play.current
import play.api.mvc._
import play.api.libs.json._

object EligibilityRequestReports extends Controller {

  def list = Action {
    DB.withSession { implicit session =>
      Ok(Json.toJson(EligibilityRequestReport.all().list.map(erp =>
        EligibilityRequestReport(erp._1, erp._2))))
    }
  }
}