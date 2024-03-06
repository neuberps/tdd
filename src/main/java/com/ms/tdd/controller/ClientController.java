package com.ms.tdd.controller;

import com.ms.tdd.model.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ClientController {

    @RequestMapping(value = "/clients")
    public List<Client> list() {
        // return Collections.emptyList();
        return Arrays.asList(Client.builder().
                name("Neuber")
                .email("neuber.paiva@gmail.com")
                .cel("9994545429").build());
    }

}
