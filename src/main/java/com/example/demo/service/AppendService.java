package com.example.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class AppendService {

    public String appendText  (String bob) {
        return bob + "hell yeah" ;
    }

    public String append ( String Patrik){

     return Patrik + "Patrik ";

    }
    }

