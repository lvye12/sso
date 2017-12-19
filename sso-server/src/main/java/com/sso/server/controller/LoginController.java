package com.sso.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BISHUILANTIAN on 2017/12/19.
 */
@RestController
public class LoginController {


    @RequestMapping("/login")
    public String login(){

        return "login success";
    }
}
