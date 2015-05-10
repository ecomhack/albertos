// @SOURCE:/Users/sebastian/projects/ecomhack/dev/albertos-api/conf/routes
// @HASH:ae0f0e579514f2f2b73e5c7a1dafd1b9dea7fec0
// @DATE:Sun May 10 00:20:34 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:9
class ReverseFoodsController {


// @LINE:9
def getProducts(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseStaticController {


// @LINE:7
// @LINE:6
def status(): Call = {
   () match {
// @LINE:6
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

}
                          

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:11
class ReverseOrdersController {


// @LINE:11
def updateOrder(id:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "orders/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

}
                          
}
                  


// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseFoodsController {


// @LINE:9
def getProducts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FoodsController.getProducts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseStaticController {


// @LINE:7
// @LINE:6
def status : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StaticController.status",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "status"})
      }
      }
   """
)
                        

}
              

// @LINE:14
class ReverseAssets {


// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:11
class ReverseOrdersController {


// @LINE:11
def updateOrder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.OrdersController.updateOrder",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "orders/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

}
              
}
        


// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseFoodsController {


// @LINE:9
def getProducts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FoodsController]).getProducts(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FoodsController", "getProducts", Seq(), "GET", """""", _prefix + """products""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseStaticController {


// @LINE:6
def status(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.StaticController]).status(), HandlerDef(this.getClass.getClassLoader, "", "controllers.StaticController", "status", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:11
class ReverseOrdersController {


// @LINE:11
def updateOrder(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.OrdersController]).updateOrder(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.OrdersController", "updateOrder", Seq(classOf[String]), "PUT", """""", _prefix + """orders/$id<[^/]+>""")
)
                      

}
                          
}
        
    