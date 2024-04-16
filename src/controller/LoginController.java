package controller;

import model.UserModel;

public class LoginController {
  UserModel userModel;
  LoginController(UserModel userModel){
    this.userModel=userModel;
  }

  public String getName(){
    return userModel.getName();
  }

  public void setName(String name){
    userModel.setName(name);
  }


}
