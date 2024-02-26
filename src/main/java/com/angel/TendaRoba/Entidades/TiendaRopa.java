package com.angel.TendaRoba.Entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "tienda_ropa")
public class TiendaRopa {
    @Id
    @Column(nullable = false)
    int id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tienda_id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ropa_id;

    @ManyToOne
    @JoinColumn(name = "tienda_id", updatable = false,insertable = false)
    private Tienda tienda;
    @ManyToOne
    @JoinColumn(name = "ropa_id", updatable = false,insertable = false)
    private Ropa ropa;

    public TiendaRopa() {
    }

    public TiendaRopa(int tienda_id, int ropa_id, Tienda tienda, Ropa ropa) {
        this.tienda_id = tienda_id;
        this.ropa_id = ropa_id;
        this.tienda = tienda;
        this.ropa = ropa;
    }

    public int getTienda_id() {
        return tienda_id;
    }

    public void setTienda_id(int tienda_id) {
        this.tienda_id = tienda_id;
    }

    public int getRopa_id() {
        return ropa_id;
    }

    public void setRopa_id(int ropa_id) {
        this.ropa_id = ropa_id;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Ropa getRopa() {
        return ropa;
    }

    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }
}
