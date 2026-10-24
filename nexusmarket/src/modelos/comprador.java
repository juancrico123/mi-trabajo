package application.modelos;

public class Comprador {

    private Long id;
    private String direccionPrincipal;
    private String estadoComercial;

    public Comprador() {}

    public Comprador(Long id,
                      String direccionPrincipal,
                      String estadoComercial) {
        this.id = id;
        this.direccionPrincipal = direccionPrincipal;
        this.estadoComercial = estadoComercial;
    }

    // Getters y Setters
}
