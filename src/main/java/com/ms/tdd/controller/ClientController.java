package com.ms.tdd.controller;

import com.ms.tdd.model.Client;
import com.ms.tdd.repository.ClientRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public List<Client> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> get(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping
    public Client create(@RequestBody Client entity) {
        entity.setId(ObjectId.get().toString());
        return repository.save(entity);
    }

    @PutMapping
    public Client update(@RequestBody Client entity) {
        return repository.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }

}
