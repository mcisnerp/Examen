package com.example.Examen.controller;

import com.example.Examen.entity.CD;
import com.example.Examen.entity.Cliente;
import com.example.Examen.entity.Item;
import com.example.Examen.entity.Prestamo;
import com.example.Examen.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sistema")
public class SistemaController {
    @Autowired
    private SistemaService service;

    @PostMapping("/registrarprestamo")
    public void registrarPrestamo(@RequestBody Prestamo prestamo) {
        service.getPrestamos().add(prestamo);
    }

    @PostMapping("/creaCD")
    public void creaCd(@RequestBody CD cd) {
        service.getItems().add(new CD(cd.getCode(), cd.getName()));
    }

    @GetMapping("/buscarcliente")
    private Optional<Cliente> buscarCliente(@RequestBody Cliente cliente) {
        return service.getClientes().stream().filter(c -> c.getName().equalsIgnoreCase(cliente.getName())).findFirst();
    }

    @GetMapping("/buscaritem")
    private Optional<Item> buscarItem(@RequestBody Item item) {
        return service.getItems().stream().filter(i -> i.getName().equalsIgnoreCase(item.getName())).findFirst();
    }

}
