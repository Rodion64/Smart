package Cursach.Controllers;

import Cursach.Entities.User;
import Cursach.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String getLogin(Model model) throws Exception {
        User user = new User();
        model.addAttribute("user", user);//связываем User'a с формой регистрации на странице
        return "login";
    }


}
