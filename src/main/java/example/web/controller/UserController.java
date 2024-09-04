package example.web.controller;

import example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import example.web.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/userss")
    public String printUsers(ModelMap model) {
       List<User> userList = userService.getUsersList();
        model.addAttribute("userList", userList);
        return "userss";
    }
}
