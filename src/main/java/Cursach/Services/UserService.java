package Cursach.Services;

import Cursach.Entities.User;
import Cursach.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {//метод для логина
        User user = userRepo.findByUsername(username);
        if (user == null) {//если пользователя не существует
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    public boolean saveUser(User user) {//метод созранения пользователя в БД
        User userFromBase = userRepo.findByUsername(user.getUsername());

        if (userFromBase != null) {//если пользователь с таким именем уже есть
            return false;
        }
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));//кодировка пароля
        userRepo.save(user);
        return true;

    }

    @Transactional
    public void resaveUser(User user) {
        userRepo.save(user);
    }//повторное сохранение пользователя

    @Transactional
    public User getUserAuth() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }//получение пользователя из сессии
}
