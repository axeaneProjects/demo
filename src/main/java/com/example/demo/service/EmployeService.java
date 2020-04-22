package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    private final DepartementService departementService;

    public EmployeService(DepartementService departementService) {
        this.departementService = departementService;
    }


    public String getDepartementById(Long id){
        return departementService.getDepartement(id);
    }
}
