package com.jurrutia.carrito.model;

import java.math.BigDecimal;
import java.math.MathContext;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class CarritoComun extends Carrito {

   
    public CarritoComun() {
        super();
    }

    @Override
    BigDecimal getTotal() {
        BigDecimal total = new BigDecimal(0);
       
        for (CarritoItem item : this.getItems()) {
            total = total.add(new BigDecimal(item.getCantidad()).multiply(item.getPrecio_unitario(), MathContext.DECIMAL32));
        }
        return total;
    }
    
}
