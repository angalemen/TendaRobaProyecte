package com.angel.TendaRoba.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ropa")
public class    Ropa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false)
    String marca;
    String modelo;
    String talla;
    String urlimagen;
    @ManyToOne
    @JoinColumn(name = "id_cliente", updatable = false,insertable = false)
    private Cliente cliente;

    public Ropa() {
    }


    public Ropa(int id, String marca, String modelo, String talla, String urlimagen, Cliente cliente) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.urlimagen = urlimagen;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}



