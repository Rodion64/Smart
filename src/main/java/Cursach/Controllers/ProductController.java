package Cursach.Controllers;

import Cursach.Entities.User;
import Cursach.Services.PhoneService;
import Cursach.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    private UserService userService;
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/product_{numberC}_{numberP}")
    public String showProductWithNumber(@PathVariable int numberC, @PathVariable int numberP) {
        return "/product_" + numberC + "_" + numberP;
    }

    @GetMapping("/addP_phone_{numberC}_{numberP}")
    public String addPhone(@PathVariable int numberC, @PathVariable int numberP, Model model) {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        phoneService.plusCountPhones(userAuth, numberC, numberP);
        return "/product_" + numberC + "_" + numberP;
    }

    @GetMapping("/deleteP_phone_{numberC}_{numberP}")
    public String deletePhone(@PathVariable int numberC, @PathVariable int numberP, Model model) {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        phoneService.minusCountPhones(userAuth, numberC, numberP);
        return "/product_" + numberC + "_" + numberP;
    }

}
