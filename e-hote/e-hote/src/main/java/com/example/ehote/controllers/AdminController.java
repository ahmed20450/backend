package com.example.ehote.controllers;

import com.example.ehote.entities.Client;
import com.example.ehote.services.DataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {
    private final DataService dataService;

    @GetMapping("/clients")
    public List<Client> getData(){
        return dataService.getClient();
    }
}
