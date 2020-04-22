package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DepartementService {

    public String getDepartement(Long id){
        if(id == 1L){
            return "Info";
        }
        else
            return "Autres";
    }
}
