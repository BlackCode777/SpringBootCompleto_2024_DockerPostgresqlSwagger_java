package com.blackcode.mongoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcode.mongoteste.model.ClienteModelRequest;
import com.blackcode.mongoteste.model.ClienteModelResponse;
import com.blackcode.mongoteste.service.ClienteService;

@RestController
@RequestMapping("/v1")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<ClienteModelResponse> create(@RequestBody ClienteModelRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<ClienteModelResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

}
