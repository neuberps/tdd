package com.ms.tdd.controller;

import com.ms.tdd.model.Client;
import com.ms.tdd.repository.ClientRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public List<Client> list() {
        return repository.findAll();
    }

    @PostMapping
    public Client create(@RequestBody Client entity) {
        entity.setId(ObjectId.get().toString());
        return repository.save(entity);
    }

}
