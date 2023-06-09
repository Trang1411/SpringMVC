package springmvcdemo.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springmvcdemo.domain.User;

@Component
@Data
@Configuration
@ToString
public class AccountRoot {

    private String id;
    @Value("${user.name}")
    private String name;
    @Value("${user.email}")
    private String email;
    @Value("${user.password}")
    private String password;
    @Value("${user.role}")
    private String role;


    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public User getAccountRoot() {
        User user = new User();
        user.setUsername(this.name);
        user.setId(this.id);
        user.setRole(this.role);
        user.setPassword(this.password);
        return user;
    }

}
