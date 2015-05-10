// @SOURCE:/Users/sebastian/projects/ecomhack/dev/albertos-api/conf/routes
// @HASH:ae0f0e579514f2f2b73e5c7a1dafd1b9dea7fec0
// @DATE:Sun May 10 00:20:34 CEST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_StaticController_status0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_StaticController_status0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.StaticController]).status(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.StaticController", "status", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_StaticController_status1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("status"))))
private[this] lazy val controllers_StaticController_status1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.StaticController]).status(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.StaticController", "status", Nil,"GET", """""", Routes.prefix + """status"""))
        

// @LINE:9
private[this] lazy val controllers_FoodsController_getProducts2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
private[this] lazy val controllers_FoodsController_getProducts2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FoodsController]).getProducts(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FoodsController", "getProducts", Nil,"GET", """""", Routes.prefix + """products"""))
        

// @LINE:11
private[this] lazy val controllers_OrdersController_updateOrder3_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("orders/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_OrdersController_updateOrder3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.OrdersController]).updateOrder(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.OrdersController", "updateOrder", Seq(classOf[String]),"PUT", """""", Routes.prefix + """orders/$id<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""@controllers.StaticController@.status()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """status""","""@controllers.StaticController@.status()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""@controllers.FoodsController@.getProducts()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """orders/$id<[^/]+>""","""@controllers.OrdersController@.updateOrder(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_StaticController_status0_route(params) => {
   call { 
        controllers_StaticController_status0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.StaticController]).status())
   }
}
        

// @LINE:7
case controllers_StaticController_status1_route(params) => {
   call { 
        controllers_StaticController_status1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.StaticController]).status())
   }
}
        

// @LINE:9
case controllers_FoodsController_getProducts2_route(params) => {
   call { 
        controllers_FoodsController_getProducts2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FoodsController]).getProducts())
   }
}
        

// @LINE:11
case controllers_OrdersController_updateOrder3_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_OrdersController_updateOrder3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.OrdersController]).updateOrder(id))
   }
}
        

// @LINE:14
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     