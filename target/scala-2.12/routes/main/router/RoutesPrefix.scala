
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/views_and_dynamic/conf/routes
// @DATE:Fri Oct 20 16:39:27 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
