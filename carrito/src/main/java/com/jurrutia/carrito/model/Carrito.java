package com.jurrutia.carrito.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "CARRITO")
public abstract @Data class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;
    
    @Column(name = "FECHA")
    private Date fecha;

    @Transient
    abstract BigDecimal getTotal();

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "carrito",cascade = CascadeType.PERSIST)
    private Set<CarritoItem> items;

}
