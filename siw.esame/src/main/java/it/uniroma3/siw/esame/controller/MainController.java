/*package it.uniroma3.siw.esame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// controller to access the login page

@Controller
public class MainController {

  // Login form
  @RequestMapping("/login")
  public String login() {
    return "login";
  }

  // Login form with error
  @RequestMapping("/login-error.html")
  public String loginError(Model model) {
    model.addAttribute("loginError", true);
    return "login";
  }

}*/