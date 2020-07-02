package org.gv_data.hmt.controller;

import org.gv_data.hmt.model.User;
import org.gv_data.hmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    UserService userService;
    @GetMapping("/hrs")
    public List<User> getAllHrs() {
        return userService.getAllHrsExceptCurrentHr();
    }
}
