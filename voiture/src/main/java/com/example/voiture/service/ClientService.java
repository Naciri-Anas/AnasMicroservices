package com.example.voiture.service;
import com.example.voiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
public interface ClientService {
    @GetMapping("/clients/{id}")
    public Client clientById(@PathVariable Long id);
}
