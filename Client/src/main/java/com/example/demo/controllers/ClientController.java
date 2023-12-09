package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.repositories.ClientRepository;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> findAll() {
        List<Client> clients = clientRepository.findAll();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id) throws Exception {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new Exception("Client not found"));
        return ResponseEntity.ok(client);
    }
}
