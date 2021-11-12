package com.example.Examen.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    private Integer code;
    private String name;

    public Item() {
    }

    public Item(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    public void getReturnDays(){}

    public Item(Integer code) {
        this.code = code;
    }
}
