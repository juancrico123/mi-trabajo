package modelo;

public class Inventario {

    private int idProducto;
    private int idBodega;
    private int cantidad;

    public Inventario(int idProducto, int idBodega, int cantidad) {
        this.idProducto = idProducto;
        this.idBodega = idBodega;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public boolean retirarCantidad(int cantidad) {

        if (cantidad <= 0 || cantidad > this.cantidad) {
            return false;
        }

        this.cantidad -= cantidad;
        return true;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "idProducto=" + idProducto +
                ", idBodega=" + idBodega +
                ", cantidad=" + cantidad +
                '}';
    }
}