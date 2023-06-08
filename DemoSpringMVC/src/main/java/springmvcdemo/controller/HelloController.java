package springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvcdemo.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String loiGioiThieu(Model model){
        Student student = new Student();
        student.setFullName("Nguyen Van A");
        student.setAge(25);
        Student student1 = new Student();
        student1.setFullName("Ngo Thai An");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        model.addAttribute("student1", student1);
        model.addAttribute("student", student);
        model.addAttribute("studentList", studentList);
        return "GioiThieu";
    }
}
