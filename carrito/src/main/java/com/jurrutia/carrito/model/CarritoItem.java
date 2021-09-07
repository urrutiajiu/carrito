package com.jurrutia.carrito.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CARRITO_ITEM")
public @Data class CarritoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Carrito carrito;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;

    @Column(name="CANTIDAD")
    private int cantidad;

    @Column(name="PRECIO_UNITARIO")
    private BigDecimal precio_unitario;

    
}
