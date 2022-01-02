package com.example.ApiRest_AlexisGonzalezMoreno.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Etiqueta {
    @Id
    private String lenguaje;

    public Etiqueta() {
    }

    public Etiqueta(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }
}
