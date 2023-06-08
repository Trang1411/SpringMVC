package springmvcdemo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;

@Data
@Document(collection = "user")
@NoArgsConstructor
@Configuration
public class User {
    @Id
    private String id;

    @Field("user_name")
    @NotBlank
    @Size(max = 50)
    private String username;

    @Field("email")
    @NotBlank
    @Size(max = 50)
    public String email;

    @Field("password")
    @NotBlank
    @Size(max = 120)
    private String password;

    @Field("role")
    private String role;

    @Field("creator")
    private String creator;

    public User(String username, String email, String password, String creator) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.creator = creator;
    }

}
