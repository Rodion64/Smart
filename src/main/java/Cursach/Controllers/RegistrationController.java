package Cursach.Controllers;

import Cursach.Entities.User;
import Cursach.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") User user, Model model) throws Exception {//метод регистрации пользователя
        if (user.getPassword().length() < 6) {
            model.addAttribute("errorLenPassword", true);
        }
        if (userService.findByUsername(user.getUsername()) != null) {
            model.addAttribute("errorAlreadyExistsUsername", true);
            return "login";
        }
        try {
            userService.saveUser(user);//сохранение пользователя в БД
            model.addAttribute("registerSuccessful", true);
            return "redirect:/login";
        } catch (Exception e) {
            model.addAttribute("errorAnomaly", true);
            return "login";
        }

    }
}
