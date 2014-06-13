// @SOURCE:/home/jcheng/Documents/workspace/bizplay/conf/routes
// @HASH:63ec4f5cb0072d62a3b734cd497aa48045853da3
// @DATE:Fri Jun 21 13:50:44 PDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Metrics_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("metrics"))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:15
private[this] lazy val controllers_Mappings_list3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/eligibleapi/mappings"))))
        

// @LINE:18
private[this] lazy val controllers_Mappings_update4 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/eligibleapi/mappings"))))
        

// @LINE:21
private[this] lazy val controllers_MappingPayers_list5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/eligibleapi/mappingpayers"))))
        

// @LINE:24
private[this] lazy val controllers_MappingPayers_update6 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/eligibleapi/mappingpayers"))))
        

// @LINE:27
private[this] lazy val controllers_Payers_list7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/eligibleapi/payers"))))
        

// @LINE:30
private[this] lazy val controllers_Payers_update8 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/eligibleapi/payers"))))
        

// @LINE:33
private[this] lazy val controllers_EligibilityRequestReports_list9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/metrics/transactions"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """metrics""","""controllers.Metrics.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/eligibleapi/mappings""","""controllers.Mappings.list"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/eligibleapi/mappings""","""controllers.Mappings.update"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/eligibleapi/mappingpayers""","""controllers.MappingPayers.list"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/eligibleapi/mappingpayers""","""controllers.MappingPayers.update"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/eligibleapi/payers""","""controllers.Payers.list"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/eligibleapi/payers""","""controllers.Payers.update"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/metrics/transactions""","""controllers.EligibilityRequestReports.list""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Metrics_index1(params) => {
   call { 
        invokeHandler(controllers.Metrics.index, HandlerDef(this, "controllers.Metrics", "index", Nil,"GET", """ Metrics page""", Routes.prefix + """metrics"""))
   }
}
        

// @LINE:12
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:15
case controllers_Mappings_list3(params) => {
   call { 
        invokeHandler(controllers.Mappings.list, HandlerDef(this, "controllers.Mappings", "list", Nil,"GET", """ Read the eligible API mappings""", Routes.prefix + """api/eligibleapi/mappings"""))
   }
}
        

// @LINE:18
case controllers_Mappings_update4(params) => {
   call { 
        invokeHandler(controllers.Mappings.update, HandlerDef(this, "controllers.Mappings", "update", Nil,"PUT", """ Update the eligible API mappings""", Routes.prefix + """api/eligibleapi/mappings"""))
   }
}
        

// @LINE:21
case controllers_MappingPayers_list5(params) => {
   call { 
        invokeHandler(controllers.MappingPayers.list, HandlerDef(this, "controllers.MappingPayers", "list", Nil,"GET", """ Read the eligible API mapping-payers""", Routes.prefix + """api/eligibleapi/mappingpayers"""))
   }
}
        

// @LINE:24
case controllers_MappingPayers_update6(params) => {
   call { 
        invokeHandler(controllers.MappingPayers.update, HandlerDef(this, "controllers.MappingPayers", "update", Nil,"PUT", """ Update the eligible API mapping-payers""", Routes.prefix + """api/eligibleapi/mappingpayers"""))
   }
}
        

// @LINE:27
case controllers_Payers_list7(params) => {
   call { 
        invokeHandler(controllers.Payers.list, HandlerDef(this, "controllers.Payers", "list", Nil,"GET", """ Read the eligible API payers""", Routes.prefix + """api/eligibleapi/payers"""))
   }
}
        

// @LINE:30
case controllers_Payers_update8(params) => {
   call { 
        invokeHandler(controllers.Payers.update, HandlerDef(this, "controllers.Payers", "update", Nil,"PUT", """ Update the eligible API payers""", Routes.prefix + """api/eligibleapi/payers"""))
   }
}
        

// @LINE:33
case controllers_EligibilityRequestReports_list9(params) => {
   call { 
        invokeHandler(controllers.EligibilityRequestReports.list, HandlerDef(this, "controllers.EligibilityRequestReports", "list", Nil,"GET", """ Read the eligible API payers""", Routes.prefix + """api/metrics/transactions"""))
   }
}
        
}
    
}
        