package controllers

import play.api._
import play.api.mvc._
import play.mvc.Http._
import play.api.libs.json._

import models._

object User extends Controller {
  private val logger = Logger(getClass())

  // Handle register user
  def register() = Action(parse.json) { implicit request =>
    // Ok(OpenId.register(request.body))
    Ok(Json.toJson("tesst"))
  }

  // Handle get user
  def get(id: String) = Action { implicit request =>
    Ok(views.html.userGet(id))
  }

  // Handle get user_info
  def getInfo(id: String) = Action { implicit request =>
    Ok(views.html.userInfoGet())
  }

  // Handle update user
  def update = Action { implicit request =>
    Ok(views.html.userUpdate())
  }

  // Handle resign user
  def resign = Action { implicit request =>
    Ok(views.html.resign())
  }
}
