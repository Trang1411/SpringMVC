package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String loiGioiThieu(Model model){
        model.addAttribute("gioiThieu", "Xay dung chuc nang don gian trong Spring MVC");
        return "GioiThieu";
    }
}
