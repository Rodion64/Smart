package Cursach.Entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @OneToMany(mappedBy = "userID", fetch = FetchType.EAGER, orphanRemoval = true)
//связь со списком товаров у пользователя
    private Set<Phone> list = new HashSet<Phone>();
    private String username;
    private String password;
    private String phone;
    private String email;

    public User() {
    }

    public User(String username, String password, String phone, String email) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    //перегруженные методы ничего не делают,нужны для авторизации
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Phone> getList() {
        return list;
    }

    public void setList(Set<Phone> list) {
        this.list = list;
    }

    public int getPhoneCount(int catalogNumber, int phoneNumber) {//поиск количества телефонов определённого типа по номеру в каталоге
        for (Phone phone : list) {
            if (phone.getPhoneNumber() == phoneNumber && phone.getCatalogNumber() == catalogNumber) {
                return phone.getPhoneCount();
            }
        }
        return 0;
    }

    public Phone getPhone(int catalogNumber, int phoneNumber) {//поиск телефона определённого типа по номеру в каталоге
        for (Phone phone : list) {
            if (phone.getPhoneNumber() == phoneNumber && phone.getCatalogNumber() == catalogNumber) {
                return phone;
            }
        }
        return null;
    }

    public String getOrderPrice() {//получение общей стоимости заказа
        int total = 0;
        for (Phone item : this.list) {
            total += item.getPhonePrices() * item.getPhoneCount();
        }
        return total + " ₽";
    }

    public String getCartPhonesCount() {//получение количества телефонов в корзине у пользователя
        int total = 0;
        for (Phone item : this.list) {
            total += item.getPhoneCount();
        }
        return String.valueOf(total);
    }
}
