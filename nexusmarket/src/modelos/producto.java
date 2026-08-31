package modelo;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int idVendedor;
    private boolean publicado;

    public Producto(int id, String nombre, String descripcion,
                    double precio, int idVendedor) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idVendedor = idVendedor;
        this.publicado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public boolean isPublicado() {
        return publicado;
    }

    public void publicar() {
        publicado = true;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", publicado=" + publicado +
                '}';
    }
}