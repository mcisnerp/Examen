package com.example.Examen.repository;

import com.example.Examen.entity.Prestamo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Getter @Setter
public class PrestamoRespository {

    private ArrayList<Prestamo> prestamos=new ArrayList<>();

}
