package com.blackcode.mongoteste.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcode.mongoteste.model.ClienteModelRequest;
import com.blackcode.mongoteste.model.ClienteModelResponse;
import com.blackcode.mongoteste.persistence.entity.ClienteEntity;
import com.blackcode.mongoteste.persistence.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ClienteModelResponse create(ClienteModelRequest request) {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setNome(request.getNome());
        cliente.setEmail(request.getEmail());
        cliente.setTelefone(request.getTelefone());

        clienteRepository.save(cliente);

        return createResponce(cliente);
    }

    private ClienteModelResponse createResponce(ClienteEntity cliente) {
        ClienteModelResponse response = new ClienteModelResponse();
        response.setId(cliente.getId());
        response.setNome(cliente.getNome());
        response.setEmail(cliente.getEmail());
        response.setTelefone(cliente.getTelefone());

        return response;
    }

    @Override
    public List<ClienteModelResponse> getAll() {
        List<ClienteModelResponse> responses = new ArrayList<>();

        List<ClienteEntity> clientes = clienteRepository.findAll();

        if (!clientes.isEmpty()) {
            clientes.forEach(cliente -> {
                responses.add(createResponce(cliente));
            });
        }

        return responses;
    }

}
