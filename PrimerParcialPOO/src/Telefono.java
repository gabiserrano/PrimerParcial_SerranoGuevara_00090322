class TelefonoMovil extends Articulo {
    private String marca;
    private int memoriaRAM;

    public TelefonoMovil(String nombre, String modelo, String descripcion, double precio, String marca, int memoriaRAM) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
    }

   
    public String obtenerMarca() {
        return marca;
    }

    public int obtenerMemoriaRAM() {
        return memoriaRAM;
    }
}


class Laptop extends Articulo {
    private String fabricante;
    private String procesador;

    public Laptop(String nombre, String modelo, String descripcion, double precio, String fabricante, String procesador) {
        super(nombre, modelo, descripcion, precio);
        this.fabricante = fabricante;
        this.procesador = procesador;
    }

   
    public String obtenerFabricante() {
        return fabricante;
    }

    public String obtenerProcesador() {
        return procesador;
    }
}
