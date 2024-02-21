class Importado extends Producto {
    private String licenciaImportacion;

    public Importado(String nombre, double precio, String licenciaImportacion) {
        super(nombre, precio);
        this.licenciaImportacion = licenciaImportacion;
    }

    public String getLicenciaImportacion() {
        return licenciaImportacion;
    }

    public String toString() {
        return super.toString() + ", Licencia de Importación: " + licenciaImportacion;
    }
}