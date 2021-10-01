package com.batchproject.controller;


import com.batchproject.model.Admin;
import com.batchproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    //sigup admin
    @PostMapping("/signup")
    public Admin signup(@RequestBody Admin admin){
        return adminService.signup(admin);
    }



    //loginadmin

    //batch admin



}
