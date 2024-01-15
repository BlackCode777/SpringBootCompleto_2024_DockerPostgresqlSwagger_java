package com.blackcode.mongoteste.service;

import java.util.List;

import com.blackcode.mongoteste.model.ClienteModelRequest;
import com.blackcode.mongoteste.model.ClienteModelResponse;

public interface ClienteService {

    // Create getClienteById method
    ClienteModelResponse create(ClienteModelRequest request);

    List<ClienteModelResponse> getAll();

    // ClienteModelResponse getClienteById(String id);

    // ClienteModelResponse getClienteByNome(String nome);

    // Create getClienteByNome method
    // Create getClienteByEmail method
    // Create getClienteByTelefone method
    // Create getAllClientes method
    // Create createCliente method

}
