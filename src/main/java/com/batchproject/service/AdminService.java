package com.batchproject.service;

import com.batchproject.model.Admin;
import com.batchproject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;


    public Admin signup(Admin admin) {
       return adminRepository.save(admin);
    }
}
