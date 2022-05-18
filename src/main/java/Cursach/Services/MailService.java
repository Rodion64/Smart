package Cursach.Services;

import Cursach.Entities.Phone;
import Cursach.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendOrderMessage(User user) {//методы отправки письма для созданного заказа
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail());//кому
        StringBuilder messageText = new StringBuilder("Спасибо за ваш заказ!\n");

        for (Phone phone : user.getList()) {
            messageText.append(phone.getPhoneName()).append(" | ")
                    .append(phone.getPhoneCount())
                    .append("x | ")
                    .append(phone.getPhonePrices()).append("₽|\n");
        }
        messageText.append("\nОбщая стоимость: ").append(user.getOrderPrice());
        message.setText(messageText.toString());//текст письма
        message.setSubject("Заказ на сайте");//тема письма(чтобы письмо не улетело в спам)
        mailSender.send(message);//отправка сообщения
    }


}
