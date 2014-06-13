// @SOURCE:/home/jcheng/Documents/workspace/bizplay/conf/routes
// @HASH:63ec4f5cb0072d62a3b734cd497aa48045853da3
// @DATE:Fri Jun 21 13:50:44 PDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._


import Router.queryString


// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:33
class ReverseEligibilityRequestReports {
    

// @LINE:33
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/metrics/transactions")
}
                                                
    
}
                          

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
class ReverseMetrics {
    

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "metrics")
}
                                                
    
}
                          

// @LINE:30
// @LINE:27
class ReversePayers {
    

// @LINE:30
def update(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/eligibleapi/payers")
}
                                                

// @LINE:27
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/eligibleapi/payers")
}
                                                
    
}
                          

// @LINE:18
// @LINE:15
class ReverseMappings {
    

// @LINE:18
def update(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/eligibleapi/mappings")
}
                                                

// @LINE:15
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/eligibleapi/mappings")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:24
// @LINE:21
class ReverseMappingPayers {
    

// @LINE:24
def update(): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/eligibleapi/mappingpayers")
}
                                                

// @LINE:21
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/eligibleapi/mappingpayers")
}
                                                
    
}
                          
}
                  


// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:33
class ReverseEligibilityRequestReports {
    

// @LINE:33
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EligibilityRequestReports.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/metrics/transactions"})
      }
   """
)
                        
    
}
              

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseMetrics {
    

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Metrics.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "metrics"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:27
class ReversePayers {
    

// @LINE:30
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Payers.update",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/eligibleapi/payers"})
      }
   """
)
                        

// @LINE:27
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Payers.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/eligibleapi/payers"})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:15
class ReverseMappings {
    

// @LINE:18
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mappings.update",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/eligibleapi/mappings"})
      }
   """
)
                        

// @LINE:15
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mappings.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/eligibleapi/mappings"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:21
class ReverseMappingPayers {
    

// @LINE:24
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MappingPayers.update",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/eligibleapi/mappingpayers"})
      }
   """
)
                        

// @LINE:21
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MappingPayers.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/eligibleapi/mappingpayers"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:33
class ReverseEligibilityRequestReports {
    

// @LINE:33
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EligibilityRequestReports.list(), HandlerDef(this, "controllers.EligibilityRequestReports", "list", Seq(), "GET", """ Read the eligible API payers""", _prefix + """api/metrics/transactions""")
)
                      
    
}
                          

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
class ReverseMetrics {
    

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Metrics.index(), HandlerDef(this, "controllers.Metrics", "index", Seq(), "GET", """ Metrics page""", _prefix + """metrics""")
)
                      
    
}
                          

// @LINE:30
// @LINE:27
class ReversePayers {
    

// @LINE:30
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Payers.update(), HandlerDef(this, "controllers.Payers", "update", Seq(), "PUT", """ Update the eligible API payers""", _prefix + """api/eligibleapi/payers""")
)
                      

// @LINE:27
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Payers.list(), HandlerDef(this, "controllers.Payers", "list", Seq(), "GET", """ Read the eligible API payers""", _prefix + """api/eligibleapi/payers""")
)
                      
    
}
                          

// @LINE:18
// @LINE:15
class ReverseMappings {
    

// @LINE:18
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mappings.update(), HandlerDef(this, "controllers.Mappings", "update", Seq(), "PUT", """ Update the eligible API mappings""", _prefix + """api/eligibleapi/mappings""")
)
                      

// @LINE:15
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mappings.list(), HandlerDef(this, "controllers.Mappings", "list", Seq(), "GET", """ Read the eligible API mappings""", _prefix + """api/eligibleapi/mappings""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:24
// @LINE:21
class ReverseMappingPayers {
    

// @LINE:24
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MappingPayers.update(), HandlerDef(this, "controllers.MappingPayers", "update", Seq(), "PUT", """ Update the eligible API mapping-payers""", _prefix + """api/eligibleapi/mappingpayers""")
)
                      

// @LINE:21
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MappingPayers.list(), HandlerDef(this, "controllers.MappingPayers", "list", Seq(), "GET", """ Read the eligible API mapping-payers""", _prefix + """api/eligibleapi/mappingpayers""")
)
                      
    
}
                          
}
                  
      