package es.jpexposito.app.model;

public class ProductoModelo {
    String codigo;
    String nombre;
    //.. cualquier otra propiedad
    // constructores toString equals

    public ProductoModelo(String codigo) {
        this.codigo = codigo;
    }

    public ProductoModelo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }


}
