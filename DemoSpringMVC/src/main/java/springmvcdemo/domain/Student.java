package springmvcdemo.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {
    private String id;
    private String fullName;
    private int age;
}
