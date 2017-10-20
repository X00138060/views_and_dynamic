package controllers;

import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index(String name) {
        return ok(index.render("Welcome to the Home Page", name));
    }

    public Result about() {
        return ok(about.render("About Us"));
    }

}
