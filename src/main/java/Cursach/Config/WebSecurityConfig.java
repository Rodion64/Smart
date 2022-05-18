package Cursach.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }//кодировщик пароля

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {//конфигурация страниц для авторизованных пользователей
        httpSecurity
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/registration", "/", "/index", "/catalog_**", "/product_**")
                .permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {//игнорирование файлов security
        web
                .ignoring()
                .antMatchers("/**/**.css", "/**/**.jpg", "/**/**.png", "/**/**.svg", "/**/**.js");
    }
}
