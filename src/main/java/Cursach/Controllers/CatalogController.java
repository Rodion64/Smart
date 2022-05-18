package Cursach.Controllers;

import Cursach.Entities.Phone;
import Cursach.Entities.User;
import Cursach.Services.PhoneService;
import Cursach.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CatalogController {
    @Autowired
    private PhoneService phoneService;
    @Autowired
    private UserService userService;

    @GetMapping("/catalog_{number}")
    public String showCatalogWithNumber(@PathVariable int number) {
        return "/catalog_" + number;
    }

    @GetMapping("/add_phone_{numberC}_{numberP}")
    public String addPhoneFromCatalog(@PathVariable int numberC, @PathVariable int numberP) {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        phoneService.plusCountPhones(userAuth, numberC, numberP);
        return "catalog_" + numberC;
    }

    @GetMapping("/delete_phone_{numberC}_{numberP}")
    public String deletePhoneFromCatalog(@PathVariable int numberC, @PathVariable int numberP) {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        phoneService.minusCountPhones(userAuth, numberC, numberP);
        return "catalog_" + numberC;
    }
}
