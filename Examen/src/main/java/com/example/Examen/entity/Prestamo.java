package com.example.Examen.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Prestamo extends Item {
    private String date;
    private Item item;
    private String returnDate;
    private String status;

    public void prestamo(String date,String returnDate,Item item){

    }

    public Prestamo(Integer code, Item item) {
        super(code);
        this.item = item;
    }

    public Prestamo(Integer code) {
        this.item.setCode(code);
    }
}
