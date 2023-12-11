package com.ultproject.cabmed.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adminController {

    @GetMapping("/admin")
    public String showAdmin() {
        return "/admin/index";
    }

}
