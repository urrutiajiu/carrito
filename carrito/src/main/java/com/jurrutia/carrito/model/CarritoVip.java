package com.jurrutia.carrito.model;

import java.math.BigDecimal;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CarritoVip extends Carrito {

    public CarritoVip() {
        super();
    }

    @Override
    BigDecimal getTotal() {
        if (this.getItems().size() == 10)
            return new BigDecimal(10);

        return new BigDecimal(5);
    }
    
}
