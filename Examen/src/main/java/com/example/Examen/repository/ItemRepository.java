package com.example.Examen.repository;

import com.example.Examen.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Getter @Setter
public class ItemRepository {
    private ArrayList<Item> items=new ArrayList<>();

}
