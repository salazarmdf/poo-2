class Nacional extends Producto {
    private String registroDIAN;

    public Nacional(String nombre, double precio, String registroDIAN) {
        super(nombre, precio);
        this.registroDIAN = registroDIAN;
    }

    public String getRegistroDIAN() {
        return registroDIAN;
    }

    public String toString() {
        return super.toString() + ", Registro DIAN: " + registroDIAN;
    }
}