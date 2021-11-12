package com.example.Examen.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cliente {
    private String name;
    private String dni;
    private String address;
    private List<Prestamo> prestamos;

    public Prestamo addPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
        return prestamo;
    }

    public Cliente(String name, String dni, String address) {
        this.name = name;
        this.dni = dni;
        this.address = address;
    }

    public Cliente(String dni) {
        this.dni = dni;
    }

}
