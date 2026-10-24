package application.modelos;

import java.util.List;

public class Carrito {

    private Long id;
    private Comprador comprador;
    private List<ItemCarrito> items;

    public Carrito() {}

    public Carrito(Long id,
                   Comprador comprador,
                   List<ItemCarrito> items) {
        this.id = id;
        this.comprador = comprador;
        this.items = items;
    }

    // Getters y Setters
}