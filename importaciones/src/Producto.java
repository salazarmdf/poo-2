import java.util.ArrayList;
import java.util.Scanner;


class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
}