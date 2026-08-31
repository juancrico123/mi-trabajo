package modelo;

public class Pedido {

    private int id;
    private Carrito carrito;
    private String estado;

    public Pedido(int id, Carrito carrito) {
        this.id = id;
        this.carrito = carrito;
        this.estado = "Pendiente de Pago";
    }

    public int getId() {
        return id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public String getEstado() {
        return estado;
    }

    public void validarPago() {

        if (estado.equals("Pendiente de Pago")) {
            estado = "Pagado";
        }
    }

    @Override
    public String toString() {

        return "Pedido #" + id +
                " | Estado: " + estado +
                " | Total: $" + carrito.calcularTotal();
    }
}