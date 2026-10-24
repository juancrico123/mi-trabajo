package application.modelos;

public class Usuario {

    private Long id;
    private String nombreCompleto;
    private String correo;
    private String rol;
    private String estado;

    public Usuario() {}

    public Usuario(Long id, String nombreCompleto,
                   String correo,
                   String rol,
                   String estado) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.rol = rol;
        this.estado = estado;
    }

    // Getters y Setters
}