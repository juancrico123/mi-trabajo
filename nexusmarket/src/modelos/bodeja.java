package modelo;

public class Bodega {

    private int id;
    private String nombre;
    private int idVendedor;

    public Bodega(int id, String nombre, int idVendedor) {
        this.id = id;
        this.nombre = nombre;
        this.idVendedor = idVendedor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    @Override
    public String toString() {
        return "Bodega{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idVendedor=" + idVendedor +
                '}';
    }
}