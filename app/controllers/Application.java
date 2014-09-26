package controllers;

import model.User;
import play.*;
import play.core.Router;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("ready."));
    }

    public static Result addUser(){
        User user = Form.form(User.class).bindFromRequest().get();
        user.save();
        return redirect(routes.Application.index());
    }

    public static Result getUsers() {
        List<User> users = new Model.Finder(String.class, User.class).all();
        return ok(toJson(users));
    }
}
