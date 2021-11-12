package com.example.Examen.repository;

import com.example.Examen.entity.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Getter @Setter
public class ClienteRepository {
    private ArrayList<Cliente> clientes=new ArrayList<>();


}
