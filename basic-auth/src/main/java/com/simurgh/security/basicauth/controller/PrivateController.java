package com.simurgh.security.basicauth.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String sAWorld(){
        return "S.A. World! from private endpoint.";
    }

    @GetMapping("/user")
    public String sAWorldUserPrivate(){
        return "S.A. World! from USER private endpoint.";
    }

    @GetMapping("/admin")
    public String sAWorldAdminPrivate(){
        return "S.A. World! from ADMIN private endpoint.";
    }

}
