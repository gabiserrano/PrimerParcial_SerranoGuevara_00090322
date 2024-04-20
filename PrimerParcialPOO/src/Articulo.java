//Interfaz metodos comunes

interface ArticuloElectronico {
    double obtenerPrecio();
    String obtenerDescripcion();
}

// Clase abstracta para atributos compartidos
abstract class Articulo implements ArticuloElectronico {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected double precio;

    public Articulo(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return descripcion;
    }
}
