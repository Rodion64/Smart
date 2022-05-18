package Cursach.Repositories;

import Cursach.Entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepo extends JpaRepository<Phone, Integer> {//связь с БД телефонов
    Phone findPhoneByCatalogNumberAndPhoneNumber(int catalogNumber, int phoneNumber);
}
