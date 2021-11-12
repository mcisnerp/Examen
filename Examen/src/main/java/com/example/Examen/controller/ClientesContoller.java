package com.example.Examen.controller;

import com.example.Examen.entity.Cliente;
import com.example.Examen.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientesContoller {

    @Autowired
    private ClienteRepository clientes;


    @PostMapping//C
    public void crearCliente(@RequestBody Cliente cliente) {
        clientes.getClientes().add(new Cliente(cliente.getName(),cliente.getDni(),cliente.getAddress()));
    }

    @GetMapping//R
    public List<Cliente> getCliente() {
        return clientes.getClientes();
    }

    @PutMapping//U
    public void modificarCliente(@RequestBody Cliente cliente) {
        borrarCliente(cliente.getName());
        clientes.getClientes().add(cliente);
    }


    @DeleteMapping//D
    public void eliminarCliente(@RequestBody Cliente cliente) {
        borrarCliente(cliente.getName());
    }

    public void borrarCliente(String nombre) {
        Optional<Cliente> optionalCliente = buscarCliente(nombre);
        if (optionalCliente.isPresent()) {
            clientes.getClientes().remove(optionalCliente.get());
        }
    }
    private Optional<Cliente> buscarCliente(String nombre) {
        return clientes.getClientes().stream().filter(c -> c.getName().equalsIgnoreCase(nombre)).findFirst();
    }


}
