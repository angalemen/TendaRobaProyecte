package com.angel.TendaRoba.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "dirección")
public class Direccion{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false)
    String ciudad;
    String provincia;
    String direc;

    @OneToOne
    @JoinColumn(name = "tienda_id")
    private Tienda tienda;

    public Direccion() {
    }


    public Direccion(int id, String ciudad, String provincia, String direc, Tienda tienda) {
        this.id = id;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.direc = direc;
        this.tienda = tienda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
}
