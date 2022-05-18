package Cursach.Services;

import Cursach.Entities.Phone;
import Cursach.Entities.User;
import Cursach.Repositories.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
public class PhoneService {
    @Autowired
    private PhoneRepo phoneRepo;
    @Autowired
    UserService userService;

    @Transactional
    public void plusCountPhones(User user, int catalogNumber, int phoneNumber) {//прибавление кол-ва телефонов
        Phone phone;
        if (user.getPhoneCount(catalogNumber, phoneNumber) == 0) {//если ещё нет в БД
            phone = new Phone(user, catalogNumber, phoneNumber);
            addPhone(phone, user);
        } else {
            phone = user.getPhone(catalogNumber, phoneNumber);
            phone.setPhoneCount(phone.getPhoneCount() + 1);
        }
        phoneRepo.save(phone);
    }

    @Transactional
    public void minusCountPhones(User user, int catalogNumber, int phoneNumber) {
        Phone phone = user.getPhone(catalogNumber, phoneNumber);
        switch (user.getPhoneCount(catalogNumber, phoneNumber)) {//если ещё нет в БД
            case 0:
                return;
            case 1: {//если остался последний
                deletePhonefromUser(phone, user);
                break;
            }
            default: {
                phone.setPhoneCount(phone.getPhoneCount() - 1);
                phoneRepo.save(phone);
            }

        }

    }

    public void addPhone(Phone phone, User user) {//добавление телефона пользователю
        user.getList().add(phone);
        savePhone(phone);
    }

    @Transactional
    public void deletePhonefromUser(Phone phone, User user) {//добавление телефона пользователя
        user.getList().remove(phone);
        userService.resaveUser(user);
        deletePhone(phone);
    }

    @Transactional
    public void savePhone(Phone phone) {
        phoneRepo.save(phone);
    }//сохранение телефона в БД


    @Transactional
    public void deletePhone(Phone phone) {
        phoneRepo.deleteById(phone.getId());
    }//удаление телефона по id

    @Transactional
    public void deletePhones(Set<Phone> phoneSet) {
        phoneRepo.deleteAll(phoneSet);
    }//удаление списка всех телефонов в БД у пользователя

    @Transactional
    public List<Phone> GetPhones(Set<Phone> phoneSet) {
        return phoneRepo.findAll();
    }
}
