package Cursach.Controllers;

import Cursach.Entities.User;
import Cursach.Services.MailService;
import Cursach.Services.PhoneService;
import Cursach.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasketController {
    @Autowired
    private UserService userService;
    @Autowired
    private PhoneService phoneService;
    @Autowired
    private MailService mailService;

    @GetMapping("/basket")
    public String showBasket(Model model) {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        model.addAttribute("phones", userAuth.getList());//добавляем на страницу список товаров пользователя
        return "basket";
    }

    @GetMapping("/clear")
    public String clearCart() {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        phoneService.deletePhones(userAuth.getList());//очистка БД
        userAuth.getList().clear();//очистка локального списка
        return "basket";
    }

    @GetMapping("/order")
    public String GetOrder(Model model) {
        User userAuth = userService.getUserAuth();//авторизованный пользователь
        mailService.sendOrderMessage(userAuth);//отправка письма
        phoneService.deletePhones(userAuth.getList());//очистка БД
        userAuth.getList().clear();//очистка локального списка
        model.addAttribute("infoSetting", true);//вывод на страницу сообщение об успешном создании заказа
        model.addAttribute("message", "Заказ успешно создан");
        return "basket";
    }
}
