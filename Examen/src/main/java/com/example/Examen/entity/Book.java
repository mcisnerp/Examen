package com.example.Examen.entity;

public class Book extends Item {

    @Override
    public void getReturnDays() {
        super.getReturnDays();
    }

    public Book(Integer code,String name) {
        super(code, name);
    }
}
