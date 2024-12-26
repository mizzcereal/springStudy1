package com.example.homepage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.homepage.DTO.UserDto;
import com.example.homepage.Service.JoinService;

@Controller
public class JoinController {
    
    @Autowired
    private JoinService joinService;

    @GetMapping("/join")
    public String join(){
        return "/auth/join";
    }

    @PostMapping("/join/auth")
    public String joinAuth(@ModelAttribute UserDto userDto){
        joinService.joinUser(userDto);
        return "redirect:/";
    }
}
