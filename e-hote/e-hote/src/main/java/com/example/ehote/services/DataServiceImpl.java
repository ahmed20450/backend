package com.example.ehote.services;


import com.example.ehote.entities.Client;
import com.example.ehote.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DataServiceImpl implements DataService{

    @Autowired
    private final ClientRepository clientRepository;

    @Override
    public List<Client> getClient() {
        return clientRepository.findAll();
}
}

