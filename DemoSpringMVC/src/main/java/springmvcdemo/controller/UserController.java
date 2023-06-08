package springmvcdemo.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springmvcdemo.domain.Password;
import springmvcdemo.domain.User;
import springmvcdemo.sevice.UserService;

import java.util.List;

@RestController
//@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UserController {
    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

    private final UserService userService;
//    private final JwtUtils jwtUtils;

//    @PostMapping("/createAdmin")
////    @AuthorizationAPI(roles = {"ROOT"})
//    public ResponseEntity<User> createAdmin(@RequestParam(value = "email") String email) {
////        TokenSession session = UserContext.getUserContext();
//        User user = new User();
//        user.setEmail(email);
//        user.setPassword(Password.generateRandomPassword());
//        user.setRole("ADMIN");
////        user.setCreator(session.getEmail());
//        userService.createAdmin(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List <User> userList = userService.findAllAdmin();
        theModel.addAttribute("users", userList);
        return "User";
    }
    @PostMapping("/createAdmin")
    public String createAdmin(@ModelAttribute(value = "user") String email) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(Password.generateRandomPassword());
        user.setRole("ADMIN");
//        user.setCreator(session.getEmail());
        userService.createAdmin(user);
        return "User";
    }

    @GetMapping("/getAllAdmin")
//    @AuthorizationAPI(roles = {"ROOT"})
    public ResponseEntity<List> getAllAdmin() {
        List<User> userList = userService.findAllAdmin();
        return ResponseEntity.status(HttpStatus.OK).body(userList);
    }

    @DeleteMapping("/deleteAdmin")
//    @AuthorizationAPI(roles = {"ROOT"})
    public ResponseEntity<User> deleteAdmin(@RequestParam(value = "userId") String userId){
        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
