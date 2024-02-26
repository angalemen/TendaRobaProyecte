package com.angel.TendaRoba.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false)
    String Nombre;
    String urlimagen;


    public Tienda() {
    }

    public Tienda(int id, String nombre, String urlimagen) {
        this.id = id;
        Nombre = nombre;
        this.urlimagen = urlimagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }
}
