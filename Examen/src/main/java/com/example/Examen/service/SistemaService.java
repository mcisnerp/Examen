package com.example.Examen.service;

import com.example.Examen.entity.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Getter @Setter
@Service
public class SistemaService {

    private List<Prestamo> prestamos;

    private List<Cliente> clientes;

    private List<Item> items;

    public void createBook(Integer code, String name){
        items.add(new Book(code,name));
    }

    public void crearCD(Integer code, String name){
        items.add(new CD(code,name));
    }

    public void crearPrestamo( String dni,Integer  codigo){
        prestamos.add(new Cliente(dni).addPrestamo(new Prestamo(codigo)));
    }

    public void addPrestamo(Prestamo p){
        prestamos.add(p);
    }

    public void crearCliente(String dni,String name,String address){
        clientes.add(new Cliente(dni,name,address));
    }

    public void addCliente (Cliente c){
        clientes.add(c);
    }
}
