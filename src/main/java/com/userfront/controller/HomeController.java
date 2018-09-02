/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }
    
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
