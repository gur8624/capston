package org.zerock.capston.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.capston.dto.chargerDTO;
import org.zerock.capston.dto.userDTO;

@Controller
@RequestMapping("/")
@Log4j2
@RequiredArgsConstructor
public class CapstonController {

    @GetMapping("/main")
    public void main(chargerDTO chargerDTO, Model model) {

        model.addAttribute("result" );
        //서비스 추가해야됨
    }

    @PostMapping("/login")
    public void login(userDTO userDTO, Model model) {

        model.addAttribute("result");
        //서비스추가
    }



}
